package com.dyuproject.protostuff.benchmark;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.dyuproject.protostuff.benchmark.serializers.ObjectSerializer;


/**
 * Copied from http://thrift-protobuf-compare.googlecode.com/svn/trunk/tpc/src/serializers/
 * Tweaked the method modifiers and some println parts.
 */
public class BenchmarkRunner
{
  public final static int ITERATIONS = 2000;
  public final static int TRIALS = 20;
  
  final PrintStream out;
  
  public BenchmarkRunner()
  {
    try
    {
        out = new PrintStream(new FileOutputStream(new File(
            System.getProperty("benchmark.output_dir", "target"), 
            "benchmark-"+System.currentTimeMillis()+".html")), true);
    }
    catch (FileNotFoundException e)
    {
      throw new RuntimeException();
    }
  }
  
  public BenchmarkRunner(PrintStream out)
  {
      this.out = out;
  }

  /**
   * Number of milliseconds to warm up for each operation type for each serializer. Let's
   * start with 3 seconds.
   */
  final static long WARMUP_MSECS = 3000;

  @SuppressWarnings("unchecked")
  private Set<ObjectSerializer> _serializers = new LinkedHashSet<ObjectSerializer>();

  public static void main(String... args) throws Exception
  {
    BenchmarkMain.main(args);
  }

  @SuppressWarnings("unchecked")
  public void addObjectSerializer(ObjectSerializer serializer)
  {
    _serializers.add(serializer);
  }

  private <T> double createObjects(ObjectSerializer<T> serializer, int iterations) throws Exception
  {
    long delta = 0;
    for (int i = 0; i < iterations; i++)
    {
      long start = System.nanoTime();
      serializer.create();
      delta += System.nanoTime() - start;
    }
    return iterationTime(delta, iterations);
  }

  private double iterationTime(long delta, int iterations)
  {
    return (double) delta / (double) (iterations);
  }

  private <T> double serializeObjects(ObjectSerializer<T> serializer, int iterations) throws Exception
  {
    // let's reuse same instance to reduce overhead
    long delta = 0;
    for (int i = 0; i < iterations; i++)
    {
      T obj = serializer.create();
      long start = System.nanoTime();
      serializer.serialize(obj);
      delta += System.nanoTime() - start;
      if (i % 1000 == 0)
        doGc();
    }
    return iterationTime(delta, iterations);
  }

  private <T> double deserializeObjects(ObjectSerializer<T> serializer, int iterations) throws Exception
  {
    byte[] array = serializer.serialize(serializer.create());
    long delta = 0;
    for (int i = 0; i < iterations; i++)
    {
      long start = System.nanoTime();
      serializer.deserialize(array);
      delta += System.nanoTime() - start;
    }
    return iterationTime(delta, iterations);
  }

  /**
   * JVM is not required to honor GC requests, but adding bit of sleep around request is
   * most likely to give it a chance to do it.
   */
  private void doGc()
  {
    try
    {
      Thread.sleep(100L);
    }
    catch (InterruptedException ie)
    {
    }
    System.gc();
    System.gc();
    System.gc();
    System.gc();
    try
    {
      Thread.sleep(100L);
    }
    catch (InterruptedException ie)
    {
    }
  }

  enum measurements
  {
    timeCreate, timeSer, timeDSer, totalTime, length
  }
  
  public void start() throws Exception
  {
    try
    {
      out.println("<html><body><pre>");
      doStart();
      out.println("</pre></body></html>");
    }
    finally
    {
      out.close();
    }
  }

  @SuppressWarnings("unchecked")
  private void doStart() throws Exception
  {
    out.printf("%-32s, %15s, %15s, %15s, %15s, %10s\n",
                      " ",
                      "Object create",
                      "Serialization",
                      "Deserialization",
                      "Total Time",
                      "Serialized Size");
    EnumMap<measurements, Map<String, Double>> values = new EnumMap<measurements, Map<String, Double>>(measurements.class);
    for (measurements m : measurements.values())
      values.put(m, new HashMap<String, Double>());

    for (ObjectSerializer serializer : _serializers)
    {
      /*
       * Should only warm things for the serializer that we test next: HotSpot JIT will
       * otherwise spent most of its time optimizing slower ones... Use
       * -XX:CompileThreshold=1 to hint the JIT to start immediately
       *
       * Actually: 1 is often not a good value -- threshold is the number
       * of samples needed to trigger inlining, and there's no point in
       * inlining everything. Default value is in thousands, so lowering
       * it to, say, 1000 is usually better.
       */
      warmCreation(serializer);
      doGc();
      double timeCreate = Double.MAX_VALUE;
      // do more iteration for object creation because of its short time
      for (int i = 0; i < TRIALS; i++)
        timeCreate = Math.min(timeCreate, createObjects(serializer, ITERATIONS * 100));

      warmSerialization(serializer);

      // actually: let's verify serializer actually works now:
      checkCorrectness(serializer);

      doGc();
      double timeSer = Double.MAX_VALUE;
      for (int i = 0; i < TRIALS; i++)
        timeSer = Math.min(timeSer, serializeObjects(serializer, ITERATIONS));

      warmDeserialization(serializer);
      doGc();
      double timeDSer = Double.MAX_VALUE;
      for (int i = 0; i < TRIALS; i++)
        timeDSer = Math.min(timeDSer, deserializeObjects(serializer, ITERATIONS));

      byte[] array = serializer.serialize(serializer.create());
      double totalTime = timeCreate + timeSer + timeDSer;
      out.printf("%-32s, %15.5f, %15.5f, %15.5f, %15.5f, %10d\n",
                        serializer.getName(),
                        timeCreate,
                        timeSer,
                        timeDSer,
                        totalTime,
                        array.length);
      addValue(values, serializer.getName(), timeCreate, timeSer, timeDSer, totalTime, array.length);
    }
    printImages(values);
  }

    /**
     * Method that tries to validate correctness of serializer, using
     * round-trip (construct, serializer, deserialize; compare objects
     * after steps 1 and 3).
     * Currently only done for StdMediaDeserializer...
     */
    private void checkCorrectness(ObjectSerializer serializer)
        throws Exception
    {
        Object input = serializer.create();
        byte[] array = serializer.serialize(input);
        Object output = serializer.deserialize(array);
        if (!input.equals(output)) {
            /* Should throw an exception; but for now (that we have a few
             * failures) let's just whine...
             */
            //Some impls do not override the equals(obj) method ...
            //String msg = "serializer '"+serializer.getName()+"' failed round-trip test (ser+deser produces Object different from input)";
            //throw new Exception("Error: "+msg);
            //System.err.println("WARN: "+msg);
        }
    }

  private void printImages(EnumMap<measurements, Map<String, Double>> values)
  {
    for (measurements m : values.keySet()) {
   	 Map<String, Double> map = values.get(m);
   	 ArrayList<Entry<String,Double>> list = new ArrayList<Entry<String,Double>>(map.entrySet());
   	 Collections.sort(list, new Comparator<Entry<String,Double>>() {
			public int compare (Entry<String,Double> o1, Entry<String,Double> o2) {
				double diff = o1.getValue() - o2.getValue();
				return diff > 0 ? 1 : (diff < 0 ? -1 : 0);
			}
   	 });
   	 LinkedHashMap<String,Double> sortedMap = new LinkedHashMap<String,Double>();
   	 for (Entry<String,Double> entry : list)
   		 sortedMap.put(entry.getKey(), entry.getValue());
      if(!sortedMap.isEmpty())printImage(sortedMap, m);
    }
  }

  private void printImage(Map<String, Double> map, measurements m)
  {
      StringBuilder valSb = new StringBuilder();
      String names = "";
      double max = Double.MIN_NORMAL;
      for (Map.Entry<String, Double> entry : map.entrySet())
      {
              double value = entry.getValue();
              valSb.append((int) value).append(',');
              max = Math.max(max, entry.getValue());
              names = entry.getKey() + '|' + names;
      }

      int headerSize = 30;

      int maxPixels = 300 * 1000; // Limit set by Google's Chart API.
      int width = 700;
      int maxHeight = maxPixels / width;

      int barThickness = 10;
      int barSpacing = 10;

      int height;

      // Reduce bar thickness and spacing until we can fit in the maximum height.
      while (true) {
              height = headerSize + map.size()*(barThickness + barSpacing);
              if (height <= maxHeight) break;
              barSpacing--;
              if (barSpacing == 1) break;

              height = headerSize + map.size()*(barThickness + barSpacing);
              if (height <= maxHeight) break;
              barThickness--;
              if (barThickness == 1) break;
      }

      if (height > maxHeight) {
              System.err.println("WARNING: Not enough room to fit all bars in chart.");
              height = maxHeight;
      }

      double scale = max * 1.1;
      out.println("<br/><br/>");
      out.println("<img src='http://chart.apis.google.com/chart?chtt="
              + m.name()
              + "&chf=c||lg||0||FFFFFF||1||76A4FB||0|bg||s||EFEFEF&chs="+width+"x"+height+"&chd=t:"
              + valSb.toString().substring(0, valSb.length() - 1)
              + "&chds=0,"+ scale
              + "&chxt=y"
              + "&chxl=0:|" + names.substring(0, names.length() - 1)
              + "&chm=N *f*,000000,0,-1,10&lklk&chdlp=t&chco=660000|660033|660066|660099|6600CC|6600FF|663300|663333|663366|663399|6633CC|6633FF|666600|666633|666666&cht=bhg&chbh=" + barThickness + ",0," + barSpacing + "&nonsense=aaa.png'/>");
  }

  private void addValue(EnumMap<measurements, Map<String, Double>> values,
                        String name,
                        double timeCreate,
                        double timeSer,
                        double timeDSer,
                        double totalTime,
                        double length)
  {
    values.get(measurements.timeCreate).put(name, timeCreate);
    values.get(measurements.timeSer).put(name, timeSer);
    values.get(measurements.timeDSer).put(name, timeDSer);
    values.get(measurements.totalTime).put(name, totalTime);
    values.get(measurements.length).put(name, length);
  }

  private <T> void warmCreation(ObjectSerializer<T> serializer) throws Exception
  {
    // Instead of fixed counts, let's try to prime by running for N seconds
    long endTime = System.currentTimeMillis() + WARMUP_MSECS;
    do
    {
      createObjects(serializer, 1);
    }
    while (System.currentTimeMillis() < endTime);
  }

  private <T> void warmSerialization(ObjectSerializer<T> serializer) throws Exception
  {
    // Instead of fixed counts, let's try to prime by running for N seconds
    long endTime = System.currentTimeMillis() + WARMUP_MSECS;
    do
    {
      serializeObjects(serializer, 1);
    }
    while (System.currentTimeMillis() < endTime);
  }

  private <T> void warmDeserialization(ObjectSerializer<T> serializer) throws Exception
  {
    // Instead of fixed counts, let's try to prime by running for N seconds
    long endTime = System.currentTimeMillis() + WARMUP_MSECS;
    do
    {
      deserializeObjects(serializer, 1);
    }
    while (System.currentTimeMillis() < endTime);
  }
}
