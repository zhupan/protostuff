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

package com.dyuproject.protostuff.codegen;

/**
 * Generates gwt overlays.  The message's field number will be used instead of the field name.
 * 
 * @author David Yu
 * @created Oct 17, 2009
 */

public class GwtNumericJsonGenerator extends GwtJsonGenerator
{
    
    public static final String ID = "gwt_numeric_json";
    
    public GwtNumericJsonGenerator()
    {
        super(ID);
    }
 

}
