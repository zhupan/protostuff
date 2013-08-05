//========================================================================
//Copyright 2007-2010 David Yu dyuproject@gmail.com
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

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.benchmark.MediaContent;

/**
 * TODO
 *
 * @author David Yu
 * @created Jun 13, 2010
 */
public class ProtostuffCoreGESerializer extends AbstractProtostuffSerializer
{

    public MediaContent deserialize(byte[] array) throws Exception
    {
        MediaContent mediaContent = new MediaContent();
        ProtostuffIOUtil.mergeFrom(array, 0, array.length, mediaContent, mediaContent.cachedSchema());
        return mediaContent;
    }

    public String getName()
    {
        return "protostuff";
    }

    public byte[] serialize(MediaContent content) throws Exception
    {
        return ProtostuffIOUtil.toByteArray(content, content.cachedSchema(), 
                LinkedBuffer.allocate(256));
    }

}
