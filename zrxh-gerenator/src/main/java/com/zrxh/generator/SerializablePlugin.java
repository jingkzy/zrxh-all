package com.zrxh.generator;

import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;  

/**
 * 分布式开发的话，Example对象也必须要序列化
 * 扩展一个 mybatis generator 插件，用于不仅仅在生成的实体类 还有 *Example 类都序列化
 * @author alexgaoyh
 *
 */
public class SerializablePlugin extends PluginAdapter {  
  
    private FullyQualifiedJavaType serializable;  
    private FullyQualifiedJavaType gwtSerializable;  
    private boolean addGWTInterface;  
    private boolean suppressJavaInterface;  
  
    public SerializablePlugin() {  
        super();  
        serializable = new FullyQualifiedJavaType("java.io.Serializable"); //$NON-NLS-1$  
        gwtSerializable = new FullyQualifiedJavaType("com.google.gwt.user.client.rpc.IsSerializable"); //$NON-NLS-1$  
    }  
  
    public boolean validate(List<String> warnings) {  
        // this plugin is always valid  
        return true;  
    }  
  
    @Override  
    public void setProperties(Properties properties) {  
        super.setProperties(properties);  
        addGWTInterface = Boolean.valueOf(properties.getProperty("addGWTInterface")); //$NON-NLS-1$  
        suppressJavaInterface = Boolean.valueOf(properties.getProperty("suppressJavaInterface")); //$NON-NLS-1$  
    }  
  
    @Override  
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass,  
                                                 IntrospectedTable introspectedTable) {  
        makeSerializable(topLevelClass, introspectedTable);  
        return true;  
    }  
  
    @Override  
    public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass,  
                                                 IntrospectedTable introspectedTable) {  
        makeSerializable(topLevelClass, introspectedTable);  
        return true;  
    }  
  
    @Override  
    public boolean modelRecordWithBLOBsClassGenerated(  
            TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {  
        makeSerializable(topLevelClass, introspectedTable);  
        return true;  
    }  
  
    /** 
     * 添加给Example类序列化的方法 
     * @param topLevelClass 
     * @param introspectedTable 
     * @return 
     */  
    @Override  
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,IntrospectedTable introspectedTable){  
        makeSerializable(topLevelClass, introspectedTable);  
  
        for (InnerClass innerClass : topLevelClass.getInnerClasses()) {  
            if ("GeneratedCriteria".equals(innerClass.getType().getShortName())) { //$NON-NLS-1$  
                innerClass.addSuperInterface(serializable); 
                /*
                public void setCriteria(List<Criterion> criteria) {
        			this.criteria = criteria;
        		}*/
                
                Method method = new Method();
	            method.setConstructor(true);
	            method.setName("void setCriteria");
	            Parameter parameter = new Parameter(new FullyQualifiedJavaType("java.util.List<Criterion>"),"criteria");
	            method.addParameter(parameter);
	            method.addBodyLine("this.criteria = criteria;");
	            method.setVisibility(JavaVisibility.PUBLIC);
	            
	            innerClass.addMethod(method);
            }  
            if ("Criteria".equals(innerClass.getType().getShortName())) { //$NON-NLS-1$  
                //innerClass.addSuperInterface(serializable);  
            }  
            if ("Criterion".equals(innerClass.getType().getShortName())) { //$NON-NLS-1$  
                innerClass.addSuperInterface(serializable);  
                Method method = new Method();
                method.setConstructor(true);
                method.addBodyLine(" ");
                method.setName("Criterion");
                method.setVisibility(JavaVisibility.PROTECTED);
                innerClass.addMethod(method);
                
                
                method = new Method();
	            method.setConstructor(true);
	            method.setName("void setCondition");
	            Parameter parameter = new Parameter(new FullyQualifiedJavaType("java.lang.String"),"condition");
	            method.addParameter(parameter);
	            method.addBodyLine("this.condition = condition;");
	            method.setVisibility(JavaVisibility.PUBLIC);
	            innerClass.addMethod(method);
	            
	            method = new Method();
	            method.setConstructor(true);
	            method.setName("void setValue");
	            parameter = new Parameter(new FullyQualifiedJavaType("java.lang.Object"),"value");
	            method.addParameter(parameter);
	            method.addBodyLine("this.value = value;");
	            method.setVisibility(JavaVisibility.PUBLIC);
	            innerClass.addMethod(method);
	            
	            method = new Method();
	            method.setConstructor(true);
	            method.setName("void setNoValue");
	            parameter = new Parameter(new FullyQualifiedJavaType("boolean"),"noValue");
	            method.addParameter(parameter);
	            method.addBodyLine("this.noValue = noValue;");
	            method.setVisibility(JavaVisibility.PUBLIC);
	            innerClass.addMethod(method);
	            
	            method = new Method();
	            method.setConstructor(true);
	            method.setName("void setSingleValue");
	            parameter = new Parameter(new FullyQualifiedJavaType("boolean"),"singleValue");
	            method.addParameter(parameter);
	            method.addBodyLine("this.singleValue = singleValue;");
	            method.setVisibility(JavaVisibility.PUBLIC);
	            innerClass.addMethod(method);
                
	            
	            method = new Method();
	            method.setConstructor(true);
	            method.setName("void setBetweenValue");
	            parameter = new Parameter(new FullyQualifiedJavaType("boolean"),"betweenValue");
	            method.addParameter(parameter);
	            method.addBodyLine("this.betweenValue = betweenValue;");
	            method.setVisibility(JavaVisibility.PUBLIC);
	            innerClass.addMethod(method);
	            
	            method = new Method();
	            method.setConstructor(true);
	            method.setName("void setListValue");
	            parameter = new Parameter(new FullyQualifiedJavaType("boolean"),"listValue");
	            method.addParameter(parameter);
	            method.addBodyLine("this.listValue = listValue;");
	            method.setVisibility(JavaVisibility.PUBLIC);
	            innerClass.addMethod(method);
	            
	            method = new Method();
	            method.setConstructor(true);
	            method.setName("void setTypeHandler");
	            parameter = new Parameter(new FullyQualifiedJavaType("java.lang.String"),"typeHandler");
	            method.addParameter(parameter);
	            method.addBodyLine("this.typeHandler = typeHandler;");
	            method.setVisibility(JavaVisibility.PUBLIC);
	            innerClass.addMethod(method);
                
            }  
        }  
  
        return true;  
    }  
  
    protected void makeSerializable(TopLevelClass topLevelClass,  
                                    IntrospectedTable introspectedTable) {  
        if (addGWTInterface) {  
            topLevelClass.addImportedType(gwtSerializable);  
            topLevelClass.addSuperInterface(gwtSerializable);  
        }
        
        if (!suppressJavaInterface) {  
            topLevelClass.addImportedType(serializable);  
            topLevelClass.addSuperInterface(serializable);  
            
            if(topLevelClass.getType().getShortName().contains("Example")){
            
	            Method method = new Method();
	            method.setConstructor(true);
	            method.setName("void setOredCriteria");
	            Parameter parameter = new Parameter(new FullyQualifiedJavaType("java.util.List<Criteria>"),"oredCriteria");
	            method.addParameter(parameter);
	            method.addBodyLine("this.oredCriteria = oredCriteria;");
	            method.setVisibility(JavaVisibility.PUBLIC);
	            
	            topLevelClass.addMethod(method);
            
            }
  
            Field field = new Field();  
            field.setFinal(true);  
            field.setInitializationString("1L"); //$NON-NLS-1$  
            field.setName("serialVersionUID"); //$NON-NLS-1$  
            field.setStatic(true);  
            field.setType(new FullyQualifiedJavaType("long")); //$NON-NLS-1$  
            field.setVisibility(JavaVisibility.PRIVATE);  
            context.getCommentGenerator().addFieldComment(field, introspectedTable);  
  
            topLevelClass.addField(field);  
        }  
    }  
}