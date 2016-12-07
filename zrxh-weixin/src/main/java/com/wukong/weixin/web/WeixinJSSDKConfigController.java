package com.wukong.weixin.web;

import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wukong.weixin.service.IWeixinApi;
import com.wukong.weixin.tools.ParseResourceUtil;
import com.wukong.weixin.tools.Sign;

/**
 * 
 * @author wukong
 *
 */
@Controller
@RequestMapping("/config")
public class WeixinJSSDKConfigController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Autowired
	IWeixinApi wxApi;
	@RequestMapping(value = "/jssdk")
	@ResponseBody
	public String buildWx(HttpServletRequest request) throws Exception{
		/*
		 * 注意：
		 * 1. 所有的JS接口只能在公众号绑定的域名下调用，公众号开发者需要先登录微信公众平台进入“公众号设置”的“功能设置”里填写“JS接口安全域名”。
		 * 2. 如果发现在 Android 不能分享自定义内容，请到官网下载最新的包覆盖安装，Android 自定义分享接口需升级至 6.0.2.58 版本及以上。
		 * 3. 常见问题及完整 JS-SDK 文档地址：http://mp.weixin.qq.com/wiki/7/aaa137b55fb2e0456bf8dd9148dd613f.html
		 *
		 * 开发中遇到问题详见文档“附录5-常见错误及解决办法”解决，如仍未能解决可通过以下渠道反馈：
		 * 邮箱地址：weixin-open@qq.com
		 * 邮件主题：【微信JS-SDK反馈】具体问题
		 * 邮件内容说明：用简明的语言描述问题所在，并交代清楚遇到该问题的场景，可附上截屏图片，微信团队会尽快处理你的反馈。
		 */
		
		String jsapi_ticket = wxApi.getJsApiToken().getString("ticket");
		
		String url = request.getParameter("url");
		
		Map<String, String> ret = Sign.sign(jsapi_ticket, url);
		
		String appid = ParseResourceUtil.getProperty("winxin.appID");
		String timestamp = ret.get("timestamp");
		String nonceStr = ret.get("nonceStr");
		String signature = ret.get("signature");
		
		String wxConfig = "wx.config({\n"
		    + "debug: false,\n"
		    +"appId: '"+appid+"',\n"
		    +"timestamp: "+timestamp+",\n"
		    +"nonceStr: '"+nonceStr+"',\n"
		    +"signature: '"+signature+"',\n"
		    +"jsApiList: [\n"
		    +"  'checkJsApi',\n"
		    +"  'onMenuShareTimeline',\n"
		    +"  'onMenuShareAppMessage',\n"
		    +"  'onMenuShareQQ',\n"
		    +"  'onMenuShareWeibo',\n"
		    +"  'hideMenuItems',\n"
		    +"  'showMenuItems',\n"
		    +"  'hideAllNonBaseMenuItem',\n"
		    +"  'showAllNonBaseMenuItem',\n"
		    +"  'translateVoice',\n"
		    +"  'startRecord',\n"
		    +"  'stopRecord',\n"
		    +"  'onRecordEnd',\n"
		    +"  'playVoice',\n"
		    +"  'pauseVoice',\n"
		    +"  'stopVoice',\n"
		    +"  'uploadVoice',\n"
		    +"  'downloadVoice',\n"
		    +"  'chooseImage',\n"
		    +"  'previewImage',\n"
		    +"  'uploadImage',\n"
		    +"  'downloadImage',\n"
		    +"  'getNetworkType',\n"
		    +"  'openLocation',\n"
		    +"  'getLocation',\n"
		    +"  'hideOptionMenu',\n"
		    +"  'showOptionMenu',\n"
		    +"  'closeWindow',\n"
		    +"  'scanQRCode',\n"
		    +"  'chooseWXPay',\n"
		    +"  'openProductSpecificView',\n"
		    +"  'addCard',\n"
		    +"  'chooseCard',\n"
		    +"  'openCard'\n"
		    +"]"
		    +"});";
		return wxConfig;
	}
}
