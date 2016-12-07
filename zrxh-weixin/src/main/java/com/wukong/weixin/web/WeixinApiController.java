package com.wukong.weixin.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wukong.weixin.service.IWeixinApi;

import net.sf.json.JSONObject;
/**
 * @author wukong
 *
 */
@Controller
@RequestMapping("/api")
public class WeixinApiController extends BaseController   {
	private Logger logger = LoggerFactory.getLogger(WeixinApiController.class);
	@Autowired
	IWeixinApi wxApi;
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/access_token")
	@ResponseBody
	public JSONObject accessToken() throws Exception{
		return wxApi.getAccessToken();
	}
}
