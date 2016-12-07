package com.wukong.weixin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wukong.weixin.service.IBusiApi;
import com.wukong.weixin.tools.HttpUtil;
import com.wukong.weixin.tools.ParseResourceUtil;

import net.sf.json.JSONObject;
@Service
public class BusiApiImpl implements IBusiApi {
	private Logger logger = LoggerFactory.getLogger(BusiApiImpl.class);
	@Override
	public JSONObject validateWxBind(String openid) {
		JSONObject ret = new JSONObject();
		try{
			String validate_bind_url = ParseResourceUtil.getProperty("busi.validate.bind");
			List<NameValuePair> formparams = new ArrayList<NameValuePair>();
			formparams.add(new BasicNameValuePair("openid", openid));
			ret = JSONObject.fromObject(HttpUtil.POST(validate_bind_url,formparams));
		}catch(Exception ex){
			ex.printStackTrace();
			ret.put("errcode", "61450");
			ret.put("errmsg",  "业务异常validateWxBind["+ex.getMessage()+"]");
		}
		return ret;
	}

	@Override
	public JSONObject bindWxAccount(String openid, String userName, String userPwd) {
		JSONObject ret = new JSONObject();
		try{
			String bind_weixin_url = ParseResourceUtil.getProperty("busi.bind.weixin");
			List<NameValuePair> formparams = new ArrayList<NameValuePair>();
			formparams.add(new BasicNameValuePair("openid", openid));
			formparams.add(new BasicNameValuePair("userName", userName));
			formparams.add(new BasicNameValuePair("userPwd", userPwd));
			ret = JSONObject.fromObject(HttpUtil.POST(bind_weixin_url,formparams));
		}catch(Exception ex){
			ex.printStackTrace();
			ret.put("errcode", "61450");
			ret.put("errmsg",  "业务异常bindWxAccount["+ex.getMessage()+"]");
		}
		return ret;
	}

}
