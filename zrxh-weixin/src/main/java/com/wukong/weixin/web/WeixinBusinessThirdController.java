package com.wukong.weixin.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wukong.weixin.service.IBusiApi;
import com.wukong.weixin.service.IWeixinApi;

import net.sf.json.JSONObject;
/**
 * @author wukong
 *
 */
@Controller
@RequestMapping("/third")
public class WeixinBusinessThirdController extends BaseController   {
	private Logger logger = LoggerFactory.getLogger(WeixinBusinessThirdController.class);
	@Autowired
	IWeixinApi wxApi;
	@Autowired
	IBusiApi bsApi;
	
	@RequestMapping(value = "/bind_weixin")
	@ResponseBody
	public JSONObject buildWx(String openid,String userName,String userPwd) throws Exception{
		return bsApi.bindWxAccount(openid, userName, userPwd);
	}
}
