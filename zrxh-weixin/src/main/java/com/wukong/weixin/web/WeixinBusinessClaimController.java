package com.wukong.weixin.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wukong.weixin.service.IBusiApi;
import com.wukong.weixin.service.IWeixinApi;
import com.wukong.weixin.tools.ParseResourceUtil;

import net.sf.json.JSONObject;
/**
 * @author wukong
 *
 */
@Controller
@RequestMapping("/claim")
public class WeixinBusinessClaimController extends BaseController   {
	private Logger logger = LoggerFactory.getLogger(WeixinBusinessClaimController.class);
	@Autowired
	IWeixinApi wxApi;
	@Autowired
	IBusiApi bsApi;
	/**
	 * 引导用户进入授权页面同意授权，获取code
	 * 
	 * @param busiUrl
	 * @return
	 * @throws Exception
	 */
	public String buildBusiUrl(String busiUrl) throws Exception{
		String webUrl = ParseResourceUtil.getProperty("web.url")+busiUrl;
		String appID = ParseResourceUtil.getProperty("winxin.appID");
		String html_auth = ParseResourceUtil.getProperty("html_auth");
		String html_scope = ParseResourceUtil.getProperty("html_scope");
		String redirect = html_auth+"?appid="+appID+"&redirect_uri="+java.net.URLEncoder.encode(webUrl, "utf-8")+"&response_type=code&scope="+html_scope+"&state=STATE#wechat_redirect";
		return "redirect:"+redirect;
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	/*RequestMapping(value = "/contact_us")
	public String contactUs(ModelMap modelMap, HttpServletRequest request,String code) throws Exception{
		JSONObject sessionObj = (JSONObject)request.getSession().getAttribute("openid");
		JSONObject ret = sessionObj!=null?sessionObj:wxApi.getHtmlAccessToken(code);
		if(ret.containsKey("openid")){
			String openid = ret.getString("openid");
			modelMap.put("openid", openid);
			modelMap.put("html_access_token", ret);
			if(ret.containsKey("access_token")){
				String htmlAccessToken = ret.getString("access_token");
				modelMap.put("user_info", wxApi.getUserInfo(htmlAccessToken, openid));
			}
			if(sessionObj==null){
				request.getSession().setAttribute("openid",ret);
			}
			JSONObject validate = bsApi.validateWxBind(openid);
			logger.info("validate="+validate);
			if(validate.containsKey("userId")){
				//正常业务
				return "claim/contactus";
			}else{
				//绑定微信
				modelMap.put("successUrl", "busi/contact_us");
				return "public/wxbind";
			}
		}
		//引导用户进入授权页面同意授权，获取code
		return buildBusiUrl("busi/contact_us");
	}*/
	
	/**
	 * 联系我们
	 * 
	 * @param modelMap
	 * @param request
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/contactus")
	public String contactUs(ModelMap modelMap, HttpServletRequest request,String code) throws Exception{
		JSONObject sessionObj = (JSONObject)request.getSession().getAttribute("openid");
		JSONObject ret = sessionObj!=null?sessionObj:wxApi.getHtmlAccessToken(code);
		if(ret.containsKey("openid")){
			String openid = ret.getString("openid");
			modelMap.put("openid", openid);
			modelMap.put("html_access_token", ret);
			if(ret.containsKey("access_token")){
				String htmlAccessToken = ret.getString("access_token");
				modelMap.put("user_info", wxApi.getUserInfo(htmlAccessToken, openid));
			}
			if(sessionObj==null){
				request.getSession().setAttribute("openid",ret);
			}
			//正常业务
			return "claim/contactus";
		}
		//引导用户进入授权页面同意授权，获取code
		return buildBusiUrl("claim/contactus");
	}
	
	/**
	 * 查询订单
	 * 
	 * @param modelMap
	 * @param request
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/orderlist")
	public String orderlist(ModelMap modelMap, HttpServletRequest request,String code) throws Exception{
		JSONObject sessionObj = (JSONObject)request.getSession().getAttribute("openid");
		JSONObject ret = sessionObj!=null?sessionObj:wxApi.getHtmlAccessToken(code);
		if(ret.containsKey("openid")){
			String openid = ret.getString("openid");
			modelMap.put("openid", openid);
			modelMap.put("html_access_token", ret);
			if(ret.containsKey("access_token")){
				String htmlAccessToken = ret.getString("access_token");
				modelMap.put("user_info", wxApi.getUserInfo(htmlAccessToken, openid));
			}
			if(sessionObj==null){
				request.getSession().setAttribute("openid",ret);
			}
			//正常业务
			return "claim/orderlist";
		}
		//引导用户进入授权页面同意授权，获取code
		return buildBusiUrl("claim/orderlist");
	}
	/**
	 * 预约修车
	 * 
	 * @param modelMap
	 * @param request
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/reserve")
	public String reserve(ModelMap modelMap, HttpServletRequest request,String code) throws Exception{
		JSONObject sessionObj = (JSONObject)request.getSession().getAttribute("openid");
		JSONObject ret = sessionObj!=null?sessionObj:wxApi.getHtmlAccessToken(code);
		if(ret.containsKey("openid")){
			String openid = ret.getString("openid");
			modelMap.put("openid", openid);
			modelMap.put("html_access_token", ret);
			if(ret.containsKey("access_token")){
				String htmlAccessToken = ret.getString("access_token");
				modelMap.put("user_info", wxApi.getUserInfo(htmlAccessToken, openid));
			}
			if(sessionObj==null){
				request.getSession().setAttribute("openid",ret);
			}
			//正常业务
			return "claim/reserve";
		}
		//引导用户进入授权页面同意授权，获取code
		return buildBusiUrl("claim/reserve");
	}
	
	
}
