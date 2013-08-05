//========================================================================
//Copyright 2007-2011 David Yu dyuproject@gmail.com
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

package com.dyuproject.protostuff.benchmark.serializers;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.benchmark.MediaContent;

/**
 * Benchmark the graph serializer to measure overhead.
 *
 * @author David Yu
 * @created Jan 20, 2011
 */
public class ProtostuffGraphSerializer extends AbstractProtostuffSerializer
{

    public MediaContent deserialize(byte[] array) throws Exception
    {
        MediaContent mediaContent = new MediaContent();
        GraphIOUtil.mergeFrom(array, mediaContent, mediaContent.cachedSchema());
        return mediaContent;
    }

    public String getName()
    {
        return "protostuff-graph";
    }

    public byte[] serialize(MediaContent content) throws Exception
    {
        return GraphIOUtil.toByteArray(content, content.cachedSchema(), 
                LinkedBuffer.allocate(256));
    }

}
