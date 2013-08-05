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

package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

import com.dyuproject.protostuff.model.ParamType;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.WireFormat.JavaType;

/**
 * @author David Yu
 * @created Aug 26, 2009
 */

public final class PBLiteRuntime
{
    
    @SuppressWarnings("unchecked")
    public static final ParamType BUILDER_TO_MESSAGE = new ParamType()
    {
        public Object resolveValue(Object builder)
        {
            return getGeneratedMessageLite((Builder<GeneratedMessageLite,?>)builder);
        }
        public JavaType getJavaType()
        {
            return JavaType.MESSAGE;
        }
        public boolean isPrimitive()
        {
            return false;
        }        
        public boolean isMessage()
        {
            return true;
        }
    };
    
    public static GeneratedMessageLite getGeneratedMessageLite(Builder<GeneratedMessageLite,?> builder)
    {
        GeneratedMessageLite message = builder.internalGetResult();
        if(message.isInitialized())
            return message;
        
        throw new UninitializedMessageException(message);
    }
    
    public static byte[] toByteArray(Builder<GeneratedMessageLite,?> builder)
    {
        return getGeneratedMessageLite(builder).toByteArray();
    }
    
    public static void writeTo(CodedOutputStream output, 
            Builder<GeneratedMessageLite,?> builder) throws IOException
    {
        getGeneratedMessageLite(builder).writeTo(output);
    }    
    
    public static void writeTo(OutputStream output, 
            Builder<GeneratedMessageLite,?> builder) throws IOException
    {
        getGeneratedMessageLite(builder).writeTo(output);
    }
    
    public static void writeDelimitedTo(OutputStream output, 
            Builder<GeneratedMessageLite,?> builder) throws IOException
    {
        getGeneratedMessageLite(builder).writeDelimitedTo(output);
    }

}
