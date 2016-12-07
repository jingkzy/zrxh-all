package com.wukong.weixin.service;

import net.sf.json.JSONObject;

public interface IWeixinApi {
	JSONObject getAccessToken();
	JSONObject getHtmlAccessToken(String code);
	JSONObject getUserInfo(String htmlAccessToken,String openid);
}
