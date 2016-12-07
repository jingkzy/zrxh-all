package com.wukong.weixin.service.impl;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.wukong.weixin.service.IWeixinApi;
import com.wukong.weixin.tools.HttpUtil;
import com.wukong.weixin.tools.ParseResourceUtil;

import net.sf.json.JSONObject;
@Service
public class WeixinApiImpl implements IWeixinApi {
	private Logger logger = LoggerFactory.getLogger(WeixinApiImpl.class);
	static String wxAppID = ParseResourceUtil.getProperty("winxin.appID");
	static String wxAppSecrect = ParseResourceUtil.getProperty("winxin.appsecret");
	@Override
	@Cacheable(value="baseCache")
	public JSONObject getAccessToken() {
		JSONObject ret = new JSONObject();
		try{
			String access_token = ParseResourceUtil.getProperty("access_token");
			String access_token_url = access_token + "?grant_type=client_credential&appid="+wxAppID+"&secret="+wxAppSecrect;
			ret = JSONObject.fromObject(HttpUtil.GETS(access_token_url));
		}catch(Exception ex){
			ex.printStackTrace();
			ret.put("errcode", "61450");
			ret.put("errmsg",  "业务异常getAccessToken["+ex.getMessage()+"]");
		}
		return ret;
	}
	@Override
	@Cacheable(value="baseCache",key="#root.methodName",condition="")
	public JSONObject getHtmlAccessToken(String code) {
		JSONObject ret = new JSONObject();
		if(StringUtils.isNotBlank(code)){
			try{
				String appID = ParseResourceUtil.getProperty("winxin.appID");
				String appsecret = ParseResourceUtil.getProperty("winxin.appsecret");
				String html_access_token = ParseResourceUtil.getProperty("html_access_token");
				String html_access_token_url = html_access_token + "?appid="+appID+"&secret="+appsecret+"&code=" + code + "&grant_type=authorization_code";
				ret = JSONObject.fromObject(HttpUtil.GETS(html_access_token_url));
			}catch(Exception ex){
				ex.printStackTrace();
				ret.put("errcode", "61450");
				ret.put("errmsg",  "业务异常getHtmlAccessToken["+ex.getMessage()+"]");
			}
		}else{
			ret.put("errcode", "61450");
			ret.put("errmsg",  "业务异常getHtmlAccessToken[code为空]");
		}
		return ret;
	}
	
	@Override
	@Cacheable(value="baseCache")
	public JSONObject getUserInfo(String htmlAccessToken,String openid) {
		JSONObject ret = new JSONObject();
		if(StringUtils.isNotBlank(htmlAccessToken) && StringUtils.isNotBlank(openid)){
			try{
				String user_info = ParseResourceUtil.getProperty("user_info");
				String user_info_url = user_info + "?access_token="+htmlAccessToken+"&openid="+openid+"&lang=zh_CN";
				ret = JSONObject.fromObject(HttpUtil.GETS(user_info_url));
				logger.info(ret.toString());
			}catch(Exception ex){
				ex.printStackTrace();
				ret.put("errcode", "61450");
				ret.put("errmsg",  "业务异常getHtmlAccessToken["+ex.getMessage()+"]");
			}
		}else{
			ret.put("errcode", "61450");
			ret.put("errmsg",  "业务异常getHtmlAccessToken[htmlAccessToken为空]");
		}
		return ret;
	}
}
