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

package com.dyuproject.protostuff.model;

import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.ByteString;

import junit.framework.TestCase;

/**
 * @author David Yu
 * @created Aug 25, 2009
 */

public class V2Test extends TestCase
{
    
    public void $testPrintTypes() 
    {
        Model<DefaultProperty> taskModel = Model.get(V2Lite.Task.class);
        Model<DefaultProperty> personModel = Model.get(V2Lite.Person.class);
        
        System.err.println(taskModel.getProperty("id").getPropertyMeta().getTypeClass().getSimpleName());
        System.err.println(taskModel.getProperty("name").getPropertyMeta().getTypeClass().getSimpleName());
        System.err.println(taskModel.getProperty("status").getPropertyMeta().getTypeClass().getSimpleName());
        System.err.println(taskModel.getProperty("attachment").getPropertyMeta().getTypeClass().getSimpleName());
        System.err.println(taskModel.getProperty("aboolean").getPropertyMeta().getTypeClass().getSimpleName());
        System.err.println(taskModel.getProperty("afloat").getPropertyMeta().getTypeClass().getSimpleName());
        System.err.println(taskModel.getProperty("adouble").getPropertyMeta().getTypeClass().getSimpleName());
        System.err.println(taskModel.getProperty("along").getPropertyMeta().getTypeClass().getSimpleName());
        
        System.err.println(personModel.getProperty("priorityTask").getPropertyMeta().getComponentTypeClass().getSimpleName());
        System.err.println(personModel.getProperty("currentTask").getPropertyMeta().getTypeClass().getSimpleName());
        System.err.println(personModel.getProperty("repeatedLong").getPropertyMeta().getComponentTypeClass().getSimpleName());        
    }
    
    public void testLite() throws Exception
    {

        Model<DefaultProperty> taskModel = Model.get(V2Lite.Task.class);
        Model<DefaultProperty> personModel = Model.get(V2Lite.Person.class);        
        
        //System.err.println(taskModel.getModelMeta());        
        assertTrue(taskModel.getModelMeta().getPropertyCount()==9);
        assertTrue(taskModel.getModelMeta().getMinNumber()==1);
        assertTrue(taskModel.getModelMeta().getMaxNumber()==9);
        
        //System.err.println(personModel.getModelMeta());
        assertTrue(personModel.getModelMeta().getPropertyCount()==10);
        assertTrue(personModel.getModelMeta().getMinNumber()==1);
        assertTrue(personModel.getModelMeta().getMaxNumber()==10);        
        
        V2Lite.Task task = V2Lite.Task.newBuilder()
            .setId(1)
            .build();
        
        V2Lite.Task.Builder taskBuilder = task.toBuilder();
        
        V2Lite.Person person = V2Lite.Person.newBuilder()
            .setId(2)
            .build();
        
        V2Lite.Person.Builder personBuilder = person.toBuilder();
        
        taskModel.getProperty("name").setValue(task, "foo");
        taskModel.getProperty("description").setValue(task, "bar");
        taskModel.getProperty("status").setValue(task, V2Lite.Task.Status.STARTED);
        
        assertTrue(task.getName().equals("foo"));
        assertTrue(task.getDescription().equals("bar"));
        assertTrue(task.getStatus() == V2Lite.Task.Status.STARTED);
        
        taskModel.getProperty("name").replaceValueIfNone(task, "foo1");
        taskModel.getProperty("description").removeValue(task);
        
        assertTrue(task.getName().equals("foo"));
        assertTrue(!task.hasDescription());
        assertTrue(taskModel.getProperty("description").getValue(task)==null);
        
        taskModel.getProperty("name").replaceValueIfAny(task, "food");
        taskModel.getProperty("description").replaceValueIfAny(task, "bar");
        
        assertTrue(task.getName().equals("food"));
        assertTrue(!task.hasDescription());
        assertTrue(taskModel.getProperty("description").getValue(task)==null);
        
        taskModel.getProperty("id").setValue(taskBuilder, 3);
        taskModel.getProperty("name").setValue(taskBuilder, "foo1");
        taskModel.getProperty("description").setValue(taskBuilder, "bar1");
        taskModel.getProperty("status").setValue(taskBuilder, V2Lite.Task.Status.COMPLETED);
        taskModel.getProperty("attachment").setValue(taskBuilder, new byte[]{0x30});
        taskModel.getProperty("aboolean").setValue(taskBuilder, true);
        taskModel.getProperty("afloat").setValue(taskBuilder, 10.101f);
        taskModel.getProperty("adouble").setValue(taskBuilder, 10.1010101d);
        taskModel.getProperty("along").setValue(taskBuilder, 1010101l);
        
        assertTrue(taskBuilder.getId()==3);
        assertTrue(taskBuilder.getName().equals("foo1"));
        assertTrue(taskBuilder.getDescription().equals("bar1"));
        assertTrue(taskBuilder.getStatus() == V2Lite.Task.Status.COMPLETED);
        assertTrue(taskBuilder.getAttachment().equals(ByteString.copyFrom(new byte[]{0x30})));
        assertTrue(taskBuilder.getAboolean()==true);
        assertTrue(taskBuilder.getAfloat()==10.101f);
        assertTrue(taskBuilder.getAdouble()==10.1010101d);
        assertTrue(taskBuilder.getAlong()==1010101l);
        
        personModel.getProperty("firstName").setValue(person, "John");
        personModel.getProperty("lastName").setValue(person, "Doe");
        personModel.getProperty("aGe").setValue(person, 20);
        personModel.getProperty("priorityTask").setValue(person, task);
        personModel.getProperty("currentTask").setValue(person, task);
        personModel.getProperty("repeatedLong").setValue(person, 1);
        personModel.getProperty("repeatedLong").setValue(person, 2);
        
        assertTrue(person.getFirstName().equals("John"));
        assertTrue(person.getLastName().equals("Doe"));
        assertTrue(person.getAGe()==20);
        assertTrue(person.getPriorityTask(0).getId()==1);
        assertTrue(person.getCurrentTask().getId()==task.getId());
        assertTrue(person.getRepeatedLongCount()==2);
        assertTrue(person.getRepeatedLong(0)==1);
        assertTrue(person.getRepeatedLong(1)==2);
        
        personModel.getProperty("id").setValue(personBuilder, 4);
        personModel.getProperty("priorityTask").setValue(personBuilder, task);
        personModel.getProperty("delegatedTask").setValue(personBuilder, taskBuilder);
        personModel.getProperty("image").setValue(personBuilder, new byte[]{0x31});
        personModel.getProperty("image").setValue(personBuilder, ByteString.copyFrom(new byte[]{0x32}));
        
        taskBuilder = task.toBuilder();
        
        assertTrue(personBuilder.getId()==4);
        assertTrue(personBuilder.getPriorityTask(0).getId()==task.getId());
        assertTrue(personBuilder.getDelegatedTask(0).getId()==3);
        assertTrue(personBuilder.getImageCount()==2);
        assertTrue(personBuilder.getImage(0).equals(ByteString.copyFrom(new byte[]{0x31})));
        assertTrue(personBuilder.getImage(1).equals(ByteString.copyFrom(new byte[]{0x32})));

        List<V2Lite.Task> taskList = new ArrayList<V2Lite.Task>();
        taskList.add(task);
        
        personModel.getProperty("delegatedTask").setValue(personBuilder, taskList);
        
        assertTrue(personBuilder.getDelegatedTaskCount()==2);
        assertTrue(personBuilder.getDelegatedTask(1).getId()==taskList.get(0).getId());
        
        personModel.getProperty("delegatedTask").replaceValueIfNone(personBuilder, task.toBuilder().setId(0));
        
        assertTrue(personBuilder.getDelegatedTaskCount()==2);
        assertTrue(personBuilder.getDelegatedTask(0).getId()!=0);
        
        // this will not replace (but add) if the field is repeated
        personModel.getProperty("delegatedTask").replaceValueIfAny(personBuilder, task.toBuilder().setId(5));
        
        assertTrue(personBuilder.getDelegatedTaskCount()==3);
        assertTrue(personBuilder.getDelegatedTask(2).getId()==5);
        
        // this will not replace (but add) if the field is repeated
        personModel.getProperty("delegatedTask").replaceValueIfAny(personBuilder, taskList);
        
        assertTrue(personBuilder.getDelegatedTaskCount()==4);
        assertTrue(personBuilder.getDelegatedTask(3).getId()==taskList.get(0).getId());
        
        personModel.getProperty("priorityTask").replaceValueIfNone(person, task.toBuilder().setId(0).build());
        
        assertTrue(person.getPriorityTask(0).getId()!=0);
        
        personModel.getProperty("priorityTask").replaceValueIfAny(person, task.toBuilder().setId(6).build());
        
        assertTrue(person.getPriorityTask(0).getId()==6);
        
        Model<ReadOnlyProperty> taskModelR = new Model<ReadOnlyProperty>(taskModel.getModelMeta(), 
                ReadOnlyProperty.FACTORY);        
        Model<ReadOnlyProperty> personModelR = new Model<ReadOnlyProperty>(personModel.getModelMeta(), 
                ReadOnlyProperty.FACTORY);   
        
        assertEquals(task.getName(), taskModelR.getProperty("name").getValue(task));
        assertEquals(task.getStatus(), taskModelR.getProperty("status").getValue(task));
        
        assertEquals(person.getFirstName(), "John");
        assertEquals(person.getLastName(), "Doe");
        assertEquals(person.getFirstName(), personModelR.getProperty("firstName").getValue(person));
        assertEquals(person.getLastName(), personModelR.getProperty("lastName").getValue(person));
        
        assertEquals("J", personBuilder.setFirstName("J").getFirstName());
        assertEquals("D", personBuilder.setLastName("D").getLastName());
        assertEquals(personBuilder.getFirstName(), personModelR.getProperty("firstName").getValue(personBuilder));
        assertEquals(personBuilder.getLastName(), personModelR.getProperty("lastName").getValue(personBuilder));
    }
    
    public void testSpeed() throws Exception
    {

        Model<DefaultProperty> taskModel = Model.get(V2Speed.Task.class);
        Model<DefaultProperty> personModel = Model.get(V2Speed.Person.class);        
        
        //System.err.println(taskModel.getModelMeta());        
        assertTrue(taskModel.getModelMeta().getPropertyCount()==9);
        assertTrue(taskModel.getModelMeta().getMinNumber()==1);
        assertTrue(taskModel.getModelMeta().getMaxNumber()==9);
        
        //System.err.println(personModel.getModelMeta());
        assertTrue(personModel.getModelMeta().getPropertyCount()==10);
        assertTrue(personModel.getModelMeta().getMinNumber()==1);
        assertTrue(personModel.getModelMeta().getMaxNumber()==10);        
        
        V2Speed.Task task = V2Speed.Task.newBuilder()
            .setId(1)
            .build();
        
        V2Speed.Task.Builder taskBuilder = task.toBuilder();
        
        V2Speed.Person person = V2Speed.Person.newBuilder()
            .setId(2)
            .build();
        
        V2Speed.Person.Builder personBuilder = person.toBuilder();
        
        taskModel.getProperty("name").setValue(task, "foo");
        taskModel.getProperty("description").setValue(task, "bar");
        taskModel.getProperty("status").setValue(task, V2Speed.Task.Status.STARTED);
        
        assertTrue(task.getName().equals("foo"));
        assertTrue(task.getDescription().equals("bar"));
        assertTrue(task.getStatus() == V2Speed.Task.Status.STARTED);
        
        taskModel.getProperty("name").replaceValueIfNone(task, "foo1");
        taskModel.getProperty("description").removeValue(task);
        
        assertTrue(task.getName().equals("foo"));
        assertTrue(!task.hasDescription());
        assertTrue(taskModel.getProperty("description").getValue(task)==null);
        
        taskModel.getProperty("name").replaceValueIfAny(task, "food");
        taskModel.getProperty("description").replaceValueIfAny(task, "bar");
        
        assertTrue(task.getName().equals("food"));
        assertTrue(!task.hasDescription());
        assertTrue(taskModel.getProperty("description").getValue(task)==null);
        
        taskModel.getProperty("id").setValue(taskBuilder, 3);
        taskModel.getProperty("name").setValue(taskBuilder, "foo1");
        taskModel.getProperty("description").setValue(taskBuilder, "bar1");
        taskModel.getProperty("status").setValue(taskBuilder, V2Speed.Task.Status.COMPLETED);
        taskModel.getProperty("attachment").setValue(taskBuilder, new byte[]{0x30});
        taskModel.getProperty("aboolean").setValue(taskBuilder, true);
        taskModel.getProperty("afloat").setValue(taskBuilder, 10.101f);
        taskModel.getProperty("adouble").setValue(taskBuilder, 10.1010101d);
        taskModel.getProperty("along").setValue(taskBuilder, 1010101l);
        
        assertTrue(taskBuilder.getId()==3);
        assertTrue(taskBuilder.getName().equals("foo1"));
        assertTrue(taskBuilder.getDescription().equals("bar1"));
        assertTrue(taskBuilder.getStatus() == V2Speed.Task.Status.COMPLETED);
        assertTrue(taskBuilder.getAttachment().equals(ByteString.copyFrom(new byte[]{0x30})));
        assertTrue(taskBuilder.getAboolean()==true);
        assertTrue(taskBuilder.getAfloat()==10.101f);
        assertTrue(taskBuilder.getAdouble()==10.1010101d);
        assertTrue(taskBuilder.getAlong()==1010101l);
        
        personModel.getProperty("firstName").setValue(person, "John");
        personModel.getProperty("lastName").setValue(person, "Doe");
        personModel.getProperty("aGe").setValue(person, 20);
        personModel.getProperty("priorityTask").setValue(person, task);
        personModel.getProperty("currentTask").setValue(person, task);
        personModel.getProperty("repeatedLong").setValue(person, 1);
        personModel.getProperty("repeatedLong").setValue(person, 2);
        
        assertTrue(person.getFirstName().equals("John"));
        assertTrue(person.getLastName().equals("Doe"));
        assertTrue(person.getAGe()==20);
        assertTrue(person.getPriorityTask(0).getId()==1);
        assertTrue(person.getCurrentTask().getId()==task.getId());
        assertTrue(person.getRepeatedLongCount()==2);
        assertTrue(person.getRepeatedLong(0)==1);
        assertTrue(person.getRepeatedLong(1)==2);
        
        personModel.getProperty("id").setValue(personBuilder, 4);
        personModel.getProperty("priorityTask").setValue(personBuilder, task);
        personModel.getProperty("delegatedTask").setValue(personBuilder, taskBuilder);
        personModel.getProperty("image").setValue(personBuilder, new byte[]{0x31});
        personModel.getProperty("image").setValue(personBuilder, ByteString.copyFrom(new byte[]{0x32}));
        
        taskBuilder = task.toBuilder();
        
        assertTrue(personBuilder.getId()==4);
        assertTrue(personBuilder.getPriorityTask(0).getId()==task.getId());
        assertTrue(personBuilder.getDelegatedTask(0).getId()==3);
        assertTrue(personBuilder.getImageCount()==2);
        assertTrue(personBuilder.getImage(0).equals(ByteString.copyFrom(new byte[]{0x31})));
        assertTrue(personBuilder.getImage(1).equals(ByteString.copyFrom(new byte[]{0x32})));

        List<V2Speed.Task> taskList = new ArrayList<V2Speed.Task>();
        taskList.add(task);
        
        personModel.getProperty("delegatedTask").setValue(personBuilder, taskList);
        
        assertTrue(personBuilder.getDelegatedTaskCount()==2);
        assertTrue(personBuilder.getDelegatedTask(1).getId()==taskList.get(0).getId());
        
        personModel.getProperty("delegatedTask").replaceValueIfNone(personBuilder, task.toBuilder().setId(0));
        
        assertTrue(personBuilder.getDelegatedTaskCount()==2);
        assertTrue(personBuilder.getDelegatedTask(0).getId()!=0);
        
        // this will not replace (but add) if the field is repeated
        personModel.getProperty("delegatedTask").replaceValueIfAny(personBuilder, task.toBuilder().setId(5));
        
        assertTrue(personBuilder.getDelegatedTaskCount()==3);
        assertTrue(personBuilder.getDelegatedTask(2).getId()==5);
        
        // this will not replace (but add) if the field is repeated
        personModel.getProperty("delegatedTask").replaceValueIfAny(personBuilder, taskList);
        
        assertTrue(personBuilder.getDelegatedTaskCount()==4);
        assertTrue(personBuilder.getDelegatedTask(3).getId()==taskList.get(0).getId());
        
        personModel.getProperty("priorityTask").replaceValueIfNone(person, task.toBuilder().setId(0).build());
        
        assertTrue(person.getPriorityTask(0).getId()!=0);
        
        personModel.getProperty("priorityTask").replaceValueIfAny(person, task.toBuilder().setId(6).build());
        
        assertTrue(person.getPriorityTask(0).getId()==6);
        
        Model<ReadOnlyProperty> taskModelR = new Model<ReadOnlyProperty>(taskModel.getModelMeta(), 
                ReadOnlyProperty.FACTORY);        
        Model<ReadOnlyProperty> personModelR = new Model<ReadOnlyProperty>(personModel.getModelMeta(), 
                ReadOnlyProperty.FACTORY);  
        
        assertEquals(task.getName(), taskModelR.getProperty("name").getValue(task));
        assertEquals(task.getStatus(), taskModelR.getProperty("status").getValue(task));
        
        assertEquals(person.getFirstName(), "John");
        assertEquals(person.getLastName(), "Doe");
        assertEquals(person.getFirstName(), personModelR.getProperty("firstName").getValue(person));
        assertEquals(person.getLastName(), personModelR.getProperty("lastName").getValue(person));
        
        assertEquals("J", personBuilder.setFirstName("J").getFirstName());
        assertEquals("D", personBuilder.setLastName("D").getLastName());
        assertEquals(personBuilder.getFirstName(), personModelR.getProperty("firstName").getValue(personBuilder));
        assertEquals(personBuilder.getLastName(), personModelR.getProperty("lastName").getValue(personBuilder));
    }

}
