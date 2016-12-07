package com.wukong.weixin.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wukong.weixin.service.IWeixinApi;
import com.wukong.weixin.tools.ParseResourceUtil;
import com.wukong.weixin.tools.SpringContextUtil;

import net.sf.json.JSONObject;
/**
 * @author wukong
 *
 */
@Controller
@RequestMapping("/busi")
public class WeixinBusinessController extends BaseController   {
	private Logger logger = LoggerFactory.getLogger(WeixinBusinessController.class);
	@Autowired
	IWeixinApi wxApi;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/contact_us")
	public String contactUs(ModelMap modelMap, String url,String code) throws Exception{
		JSONObject ret = wxApi.getHtmlAccessToken(code);
		logger.info("code="+code+",contactUs="+ret);
		if(ret.containsKey("openid")){
			String openid = ret.getString("openid");
			modelMap.put("openid", openid);
			modelMap.put("html_access_token", ret);
			if(ret.containsKey("access_token")){
				String htmlAccessToken = ret.getString("access_token");
				modelMap.put("user_info", wxApi.getUserInfo(htmlAccessToken, openid));
			}
			return "claim/contactus";
		}else{
			//清除缓存
			net.sf.ehcache.CacheManager cacheManager = SpringContextUtil.getBean("ehcacheManager");
			cacheManager.getCache("baseCache").remove("getHtmlAccessToken");
			String webUrl = ParseResourceUtil.getProperty("web.url")+"busi/contact_us";
			String appID = ParseResourceUtil.getProperty("winxin.appID");
			String html_auth = ParseResourceUtil.getProperty("html_auth");
			String html_scope = ParseResourceUtil.getProperty("html_scope");
			String redirect = html_auth+"?appid="+appID+"&redirect_uri="+java.net.URLEncoder.encode(webUrl, "utf-8")+"&response_type=code&scope="+html_scope+"&state=STATE#wechat_redirect";
			return "redirect:"+redirect;
		}
	}
}
