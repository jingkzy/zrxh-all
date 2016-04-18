package com.zrxh.pingche.tools;

import java.util.Properties;

public class ParseResourceUtil  {
	private static Properties properties = new Properties();
	static{
		try {
			properties.load(ParseResourceUtil.class.getClassLoader().getResourceAsStream("config.properties"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static String getProperty(String key) {
		return properties.getProperty("carinfo");
	}
	public static void main(String[] args) {
		/*Properties pps = System.getProperties();
		pps.list(System.out);*/
		System.out.println(getProperty("carinfo"));
	}
	
}
