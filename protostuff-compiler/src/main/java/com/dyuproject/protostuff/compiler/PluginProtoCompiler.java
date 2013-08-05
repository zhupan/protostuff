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

package com.dyuproject.protostuff.compiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.URL;

import org.antlr.stringtemplate.AutoIndentWriter;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import com.dyuproject.protostuff.parser.DefaultProtoLoader;
import com.dyuproject.protostuff.parser.EnumGroup;
import com.dyuproject.protostuff.parser.Message;
import com.dyuproject.protostuff.parser.Proto;
import com.dyuproject.protostuff.parser.ProtoUtil;

/**
 * A plugin proto compiler whose output relies on the 'output' param configured 
 * in {@link ProtoModule}. The output param should point to a StringTemplate resource 
 * (file, url, or from classpath). 
 *
 * @author David Yu
 * @created May 25, 2010
 */
public class PluginProtoCompiler extends STCodeGenerator
{
    
    /**
     * To enable, specify -Dppc.check_filename_placeholder=true
     */
    protected static final boolean CHECK_FILENAME_PLACEHOLDER = 
            Boolean.getBoolean("ppc.check_filename_placeholder");
    
    /**
     * Resolve the stg from the module.
     */
    public interface GroupResolver
    {
        
        /**
         * Resolve the stg from the module.
         */
        StringTemplateGroup resolveSTG(ProtoModule module);
    }
    
    public static final GroupResolver GROUP_RESOLVER = new GroupResolver()
    {
        
        public StringTemplateGroup resolveSTG(ProtoModule module)
        {
            String resource = module.getOutput();
            try
            {
                File file = new File(resource);
                if(file.exists())
                    return new StringTemplateGroup(new BufferedReader(new FileReader(file)));
                
                URL url = DefaultProtoLoader.getResource(resource, 
                        PluginProtoCompiler.class);
                if(url != null)
                {
                    return new StringTemplateGroup(new BufferedReader(
                            new InputStreamReader(url.openStream(), "UTF-8")));
                }
                if(resource.startsWith("http://"))
                {
                    return new StringTemplateGroup(new BufferedReader(
                            new InputStreamReader(new URL(resource).openStream(), "UTF-8")));
                }
            }
            catch(IOException e)
            {
                throw new RuntimeException(e);
            }
            throw new IllegalStateException("Could not find " + resource);
        }
    };
    
    public static void setGroupResolver(GroupResolver resolver)
    {
        if(resolver != null)
            __resolver = resolver;
    }
    
    /**
     * Returns null if template is not found.
     */
    public static StringTemplate getTemplateFrom(StringTemplateGroup group, 
            String template)
    {
        try
        {
            return group.lookupTemplate(template);
        }
        catch(IllegalArgumentException e)
        {
            return null;
        }
    }
    
    private static GroupResolver __resolver = GROUP_RESOLVER;
    
    public final ProtoModule module;
    public final StringTemplateGroup group;
    public final boolean protoBlock, javaOutput;
    public final String fileExtension, outputName, outputPrefix, outputSuffix;
    
    public PluginProtoCompiler(ProtoModule module)
    {
        this(module, CHECK_FILENAME_PLACEHOLDER);
    }

    public PluginProtoCompiler(ProtoModule module, boolean checkFilenamePlaceHolder)
    {
        super(module.getOutput());
        
        group = resolveSTG(module);
        
        this.module = module;
        
        protoBlock = getTemplateFrom(group, "proto_block") != null;
        
        fileExtension = getFileExtension(module.getOutput());
        javaOutput = ".java".equalsIgnoreCase(fileExtension);
        
        outputName = getOutputName(module.getOutput());
        
        final int placeHolder = checkFilenamePlaceHolder ? outputName.indexOf('$') : -1;
        if(placeHolder == -1)
        {
            // no placeholder
            outputPrefix = "";
            outputSuffix = "";
        }
        else if(placeHolder == 0)
        {
            // suffix only
            outputPrefix = "";
            outputSuffix = outputName.substring(1);
        }
        else if(placeHolder == outputName.length()-1)
        {
            // prefix only
            outputPrefix = outputName.substring(0, outputName.length()-1);
            outputSuffix = "";
        }
        else
        {
            // has both prefix and suffix
            outputPrefix = outputName.substring(0, placeHolder);
            outputSuffix = outputName.substring(placeHolder+1);
        }
    }
    
    /**
     * Returns "foo" from "path/to/foo.java.stg".
     */
    static String getOutputName(String resource)
    {
        final int secondToTheLastDot = resource.lastIndexOf('.', resource.length()-5), 
                slash = resource.lastIndexOf('/', secondToTheLastDot);
        
        return resource.substring(slash+1, secondToTheLastDot);
    }
    
    /**
     * Get the file extension of the provided stg resource.
     */
    public static String getFileExtension(String resource)
    {
        // E.g uf foo.bar.java.stg, it is the . before "java" 
        int secondToTheLastDot = resource.lastIndexOf('.', resource.length()-5);
        if(secondToTheLastDot == -1)
        {
            throw new IllegalArgumentException("The resource must be named like: 'foo.type.stg' " +
            		"where '.type' will be the file extension of the output files.");
        }
        String extension = resource.substring(secondToTheLastDot, resource.length()-4);
        // to protected against resources like "foo..stg"
        if(extension.length() < 2)
        {
            throw new IllegalArgumentException("The resource must be named like: 'foo.type.stg' " +
                        "where '.type' will be the file extension of the output files.");
        }
        
        return extension;
    }
    
    /**
     * Finds the stg resource.
     */
    public static StringTemplateGroup resolveSTG(ProtoModule module)
    {
        return __resolver.resolveSTG(module);
    }
    
    protected String resolveFileName(String name)
    {
        return outputPrefix + name + outputSuffix + fileExtension;
    }

    protected void compile(ProtoModule module, Proto proto) throws IOException
    {
        if(this.module != module)
            throw new IllegalArgumentException("Wrong module.");
        
        if(protoBlock)
        {
            compileProtoBlock(module, proto);
            return;
        }
        
        boolean hasEnumBlock = getTemplateFrom(group, "enum_block") != null;
        boolean hasMessageBlock = getTemplateFrom(group, "message_block") != null;
        
        String packageName = javaOutput ? proto.getJavaPackageName() : proto.getPackageName();
        
        if(hasEnumBlock)
        {
            for(EnumGroup eg : proto.getEnumGroups())
            {
                String fileName = resolveFileName(eg.getName());
                
                Writer writer = CompilerUtil.newWriter(module, packageName, fileName);
                AutoIndentWriter out = new AutoIndentWriter(writer);
                
                StringTemplate enumBlock = group.getInstanceOf("enum_block");
                enumBlock.setAttribute("eg", eg);
                enumBlock.setAttribute("module", module);
                enumBlock.setAttribute("options", module.getOptions());

                enumBlock.write(out);
                writer.close();
            }
        }

        if(hasMessageBlock)
        {
            for(Message m : proto.getMessages())
            {
                String fileName = resolveFileName(m.getName());
                
                Writer writer = CompilerUtil.newWriter(module, packageName, fileName);
                AutoIndentWriter out = new AutoIndentWriter(writer);
                
                StringTemplate messageBlock = group.getInstanceOf("message_block");
                messageBlock.setAttribute("message", m);
                messageBlock.setAttribute("module", module);
                messageBlock.setAttribute("options", module.getOptions());

                messageBlock.write(out);
                writer.close();
            }
        }
        
        if(!hasEnumBlock && !hasMessageBlock)
        {
            throw new IllegalStateException("At least one of these templates(proto_block| " +
            		"message_block|enum_block)need to be declared in the .stg resource.");
        }
    }
    
    protected void compileProtoBlock(ProtoModule module, Proto proto) throws IOException
    {
        String packageName = javaOutput ? proto.getJavaPackageName() : proto.getPackageName();

        String name = ProtoUtil.toPascalCase(proto.getFile().getName().replaceAll(".proto", 
                "")).toString();
        
        if(javaOutput)
        {
            String outerClassname = proto.getExtraOption("java_outer_classname");
            if(outerClassname != null)
                name = outerClassname;
        }
        
        final String fileName;
        if(outputPrefix.isEmpty() && outputSuffix.isEmpty())
        {
            // resolve the prefix/suffix from module option
            String outerFilePrefix = module.getOption("outer_file_prefix");
            if(outerFilePrefix != null)
                name = outerFilePrefix + name;
            
            String outerFileSuffix = module.getOption("outer_file_suffix");
            if(outerFileSuffix != null)
                name += outerFileSuffix;
            
            fileName = name + fileExtension;
        }
        else
        {
            // use the placeholder in the output name
            fileName = resolveFileName(name);
        }
        
        Writer writer = CompilerUtil.newWriter(module, packageName, fileName);
        
        AutoIndentWriter out = new AutoIndentWriter(writer);
        StringTemplate protoOuterBlock = group.getInstanceOf("proto_block");
        
        protoOuterBlock.setAttribute("proto", proto);
        protoOuterBlock.setAttribute("module", module);
        protoOuterBlock.setAttribute("options", module.getOptions());
        
        protoOuterBlock.write(out);
        writer.close();
    }

}
