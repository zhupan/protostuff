//========================================================================
//Copyright 2007-2009 David Yu dyuproject@gmail.com
//------------------------------------------------------------------------
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at 
//http://www.apache.org/licenses/LICENSE-2.0
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//========================================================================

package com.dyuproject.protostuff.benchmark;

import com.dyuproject.protostuff.benchmark.serializers.ProtobufLiteSerializer;
import com.dyuproject.protostuff.benchmark.serializers.ProtobufSpeedSerializer;

/**
 * @author David Yu
 * @created Oct 16, 2009
 */

public class BenchmarkMain
{
    
    public static void main(String[] args) throws Exception
    {       
        System.setProperty("benchmark.output_dir", "target");
        BenchmarkRunner runner = new BenchmarkRunner();
        configure(runner);
        System.out.println("benchmark running.");
        runner.start();
        System.out.println("benchmark ended.");
    }
    
    public static void configure(BenchmarkRunner runner) throws Exception
    {
        runner.addObjectSerializer(new ProtobufSpeedSerializer());
        runner.addObjectSerializer(new ProtobufLiteSerializer());
        
        //runner.addObjectSerializer(new ProtobufCodeSizeSerializer());
        //runner.addObjectSerializer(new ProtobufJsonSerializer());
        
        BenchmarkModules.configure(runner);
    }

}
