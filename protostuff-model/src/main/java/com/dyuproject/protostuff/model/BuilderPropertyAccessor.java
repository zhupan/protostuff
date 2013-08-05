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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * BuilderPropertyAccessor - read-and-write access on MessageLite.Builder
 * 
 * @author David Yu
 * @created Aug 23, 2009
 */

public class BuilderPropertyAccessor extends PropertyAccessor
{
    
    protected final HasMethod _has;
    protected final GetMethod _get;
    protected final ClearMethod _clear;
    protected final SetMethod _set;
    protected final ParamType _paramType;
    protected final Class<?> _typeClass;
    
    public BuilderPropertyAccessor(PropertyMeta meta)
    {
        super(meta);
        
        _get = new GetMethod();                
        _clear = new ClearMethod();
        
        if(meta.isRepeated())
        {
            _has = new RepeatedHasMethod();            
            _set = new RepeatedSetMethod();
        }
        else
        {
            _has = new HasMethod();
            _set = new SetMethod();
        }

        _get.init(meta, meta.getBuilderClass());
        _clear.init(meta);
        _has.init(meta, meta.getBuilderClass());
        _paramType = _set.init(meta);
        _typeClass = _set.getTypeClass();
    }
    
    public ParamType getParamType()
    {
        return _paramType;
    }
    
    public Class<?> getTypeClass()
    {
        return getTypeClass();
    }
    
    public Object getValue(Object builder)
    throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
    {
        return _has.hasValue(builder) ? _get.getValue(builder) : null;
    }
    
    public Object removeValue(Object builder)
    throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
    {
        if(_has.hasValue(builder))
        {
            Object value = _get.getValue(builder);
            _clear.clearValue(builder);
            return value;
        }
        return null;
    }
    
    public boolean setValue(Object builder, Object value)
    throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
    {
        if(value==null)
        {
            _clear.clearValue(builder);
            return true;
        }
        
        return _set.setValue(builder, value);
    }
    
    public boolean replaceValueIfNone(Object builder, Object value)
    throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
    {
        if(value==null || _has.hasValue(builder))
            return false;
        
        _set.setValue(builder, value);
        return true;
    }
    
    public Object replaceValueIfAny(Object builder, Object value)
    throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
    {
        if(_has.hasValue(builder))
        {
            Object last = _get.getValue(builder);
            if(value==null)
                _clear.clearValue(builder);
            else
                _set.setValue(builder, value);
            return last;
        }
        return null;
    }
    
    protected boolean set(Object builder, Object value, Method method)
    throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
    {
        if((value=_paramType.resolveValue(value))==null)
            return false;
        
        method.invoke(builder, value);
        return true;
    }
    
    static class ClearMethod
    {
        Method _method;
        
        protected void init(PropertyMeta meta)
        {
            try
            {
                _method = meta.getBuilderClass().getDeclaredMethod(
                        toPrefixedPascalCase("clear", meta.getName()), NO_ARG_C);
            }
            catch(Exception e)
            {
                throw new RuntimeException(e);
            }
        }
        
        public void clearValue(Object builder) 
        throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
        {
            _method.invoke(builder, NO_ARG);
        }
    }
    
    class SetMethod
    {
        Method _method;
        
        protected ParamType init(PropertyMeta meta)
        {
            try
            {
                _method = meta.getBuilderClass().getDeclaredMethod(
                        toPrefixedPascalCase("set", meta.getName()), 
                        new Class<?>[]{meta.getTypeClass()});
                
                return meta.isMessage() ? 
                        ParamType.getMessageType(meta.getTypeClass()) : 
                            ParamType.getSimpleType(meta.getTypeClass());
            }
            catch(Exception e)
            {
                throw new RuntimeException(e);
            }
        }
        
        public boolean setValue(Object builder, Object value) 
        throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
        {            
            return set(builder, value, _method);
        }
        
        public Class<?> getTypeClass()
        {
            return getMeta().getTypeClass();
        }
    }
    
    class RepeatedSetMethod extends SetMethod
    {
        Method _componentAdd;
        
        protected ParamType init(PropertyMeta meta)
        {
            try
            {
                _method = meta.getBuilderClass().getDeclaredMethod(
                        toPrefixedPascalCase("addAll", meta.getName()), ITERABLE_ARG_C);
                _componentAdd = meta.getBuilderClass().getDeclaredMethod(
                        toPrefixedPascalCase("add", meta.getName()), 
                        new Class<?>[]{meta.getComponentTypeClass()});
                
                return meta.isMessage() ? 
                        ParamType.getMessageType(meta.getComponentTypeClass()) : 
                            ParamType.getSimpleType(meta.getComponentTypeClass());
            }
            catch(Exception e)
            {
                throw new RuntimeException(e);
            }
        }      
        
        public boolean setValue(Object builder, Object value) 
        throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
        {
            if(List.class.isAssignableFrom(value.getClass()))
            {
                _method.invoke(builder, value);
                return true;
            }
            
            return set(builder, value, _componentAdd);
        }
        
        public Class<?> getTypeClass()
        {
            return getMeta().getComponentTypeClass();
        }
    }

}
