package com.wukong.weixin.service;

import net.sf.json.JSONObject;

public interface IBusiApi {
	JSONObject validateWxBind(String openid);
	JSONObject bindWxAccount(String openid,String userName,String userPwd);
}
