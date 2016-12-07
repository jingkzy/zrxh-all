package com.wukong.weixin.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.wukong.weixin.tools.StringEscapeEditor;

/**
 * Controller父类
 * 
 * @author wukong
 */
public abstract class BaseController {
    @InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		/**
		 * 自动转换日期类型的字段格式
		 */
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));

		/**
		 * 防止XSS攻击
		 */
		binder.registerCustomEditor(String.class, new StringEscapeEditor(true, false));
	}
    
	/**
	 * 请取请求参数值toString
	 * @param request
	 * @return
	 */
	public Map<String,String> getRequestMapByParamValues(final javax.servlet.http.HttpServletRequest request){
		Map<String,String[]> requestParams = request.getParameterMap();
		Map<String,String> paramMap=new java.util.HashMap<String, String>();
//		StringBuffer sb=new StringBuffer();
//		int ileng=0;
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
//			if(ileng==0){
//				sb.append("["+name+":"+valueStr+"]");
//			//System.out.printlnnd("\n["+name+":"+valueStr+"]");
//			}else{
//				sb.append("\n["+name+":"+valueStr+"]");
//			}
//			ileng++;
			//System.out.println("Alipay req param ["+name+":"+valueStr+"]");
			
			//乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
			//valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
			paramMap.put(name, valueStr);
		}
		return paramMap;
	}
	public String getRequestParamValues(final javax.servlet.http.HttpServletRequest request){

		//获取支付宝POST过来反馈信息

		Map<String,String[]> requestParams = request.getParameterMap();
		StringBuffer sb=new StringBuffer();
		int ileng=0;
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			if(ileng==0){
				sb.append("["+name+":"+valueStr+"]");
			//System.out.printlnnd("\n["+name+":"+valueStr+"]");
			}else{
				sb.append("\n["+name+":"+valueStr+"]");
			}
			ileng++;
			//System.out.println("Alipay req param ["+name+":"+valueStr+"]");
			
			//乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
			//valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
			//params.put(name, valueStr);
		}
		return sb.toString();

	}
}
