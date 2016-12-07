package com.wukong.weixin.tools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

/**
 * 
 * 获取spring容器，以访问容器中定义的其他bean
 * 
 * @author LP
 */
public class SpringContextUtil {

	// Spring应用上下文环境
	private static ApplicationContext applicationContext ;
	@SuppressWarnings("unchecked")
	public static <T> T getTestBean(String name){
		if(null == applicationContext){
			applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring-mvc.xml"});
		}
		return (T)applicationContext.getBean(name);
	}
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name){
		if(null == applicationContext){
			applicationContext = ContextLoaderListener.getCurrentWebApplicationContext();
		}
		return (T)applicationContext.getBean(name);
	}
}
