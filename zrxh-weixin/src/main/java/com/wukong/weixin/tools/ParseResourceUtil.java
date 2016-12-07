package com.wukong.weixin.tools;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParseResourceUtil  {
	private static Logger logger = LoggerFactory.getLogger(UUIDGenerator.class);
	private static Properties properties = new Properties();
	static{
		try {
			properties.load(ParseResourceUtil.class.getClassLoader().getResourceAsStream("config.properties"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
	public static void main(String[] args) {
		/*Properties pps = System.getProperties();
		pps.list(System.out);*/
		logger.info(getProperty("winxin.appID"));
		logger.info(getProperty("winxin.appID"));
		logger.info(getProperty("winxin.appID"));
		logger.info(getProperty("winxin.appID"));
		logger.info(getProperty("web.url"));
	}
	
}
