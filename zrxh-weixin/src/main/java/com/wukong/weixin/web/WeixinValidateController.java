package com.wukong.weixin.web;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wukong.weixin.service.IWeixinApi;
import com.wukong.weixin.tools.SHA1Tool;

import net.sf.json.JSONObject;
/**
 * @author wukong
 *
 */
@Controller
@RequestMapping("/validate")
public class WeixinValidateController extends BaseController   {
	private Logger logger = LoggerFactory.getLogger(WeixinValidateController.class);
	static String Token = "weixin";
	@Autowired
	IWeixinApi wxApi;
	
	@RequestMapping(value = "/helloWord")
	@ResponseBody
	public String accessToken() throws Exception{
		return "helloWord";
	}
	
	@RequestMapping(value = "check_signature")
	public void checkSignature(HttpServletRequest request, HttpServletResponse response) throws IOException {
		logger.info("11111111111111111");
		if (request.getMethod().toLowerCase().equals("get")) {
	    	Valid(request,response);//验证通过后可删除此行代码
	    }
		logger.info("22222222222222222");
	    if (request.getMethod().toLowerCase().equals("post")){
	    	try{
	    		weixinServer(request, response);
	    	}catch(Exception err){
	    		logger.info("微信访问异常|"+err.getMessage());
	    	}
	    }
	}
	
	public void Valid(HttpServletRequest request,HttpServletResponse response){
		try{  
			String echoStr =StringUtils.defaultIfEmpty(request.getParameter("echostr"), "");
			if (CheckSignature(request)){
				if(!echoStr.equals("")){
					response.getOutputStream().write(echoStr.getBytes("UTF-8"));
					response.getOutputStream().flush();
				}
			}
		}catch(Exception err){
			logger.info("微信验证异常|"+err.getMessage());
		}
	}
	/**
	 * 验证微信签名
	 * 将token、timestamp、nonce三个参数进行字典序排序
	 * 将三个参数字符串拼接成一个字符串进行sha1加密
	 * 开发者获得加密后的字符串可与signature对比，标识该请求来源于微信。
	 *
	 * @param request
	 * @param response
	 * @return void
	 */
	public boolean CheckSignature(HttpServletRequest request){
		try{
			logger.info("signature=");
			String signature = request.getParameter("signature");
			String timestamp = request.getParameter("timestamp");
			logger.info("signature="+signature);
			String nonce =request.getParameter("nonce");
			String[] ArrTmp = { Token, timestamp, nonce };
			Arrays.sort(ArrTmp);     //字典排序
			String tmpStr =ArrTmp[0]+ArrTmp[1]+ArrTmp[2]; 
			tmpStr = SHA1Tool.toSHA1Password(tmpStr);
			tmpStr = tmpStr.toLowerCase();
			logger.info("-------------------------------------------------------------------------------");
			logger.info("signature="+signature);
			logger.info("tmpStr="+tmpStr);
			logger.info("-------------------------------------------------------------------------------");
			if (tmpStr.equals(signature)){
				return true;
			}else{
				return false;
			}
		}catch(Exception err){
			err.printStackTrace();
			logger.info("验证微信签名异常|"+err.getMessage());
		}
		return false;
	}
	
	/**
	 * 微信主服务内容
	 *
	 * @param request
	 * @param response
	 * @return void
	 */
    private synchronized void weixinServer(HttpServletRequest request,HttpServletResponse response) {
		try{
			ServletOutputStream outPutStream = response.getOutputStream();
			String strresponse = "<xml>";
			//回复消息的部分
			Document document=DocumentHelper.createDocument();
			org.dom4j.io.SAXReader saxReader = new org.dom4j.io.SAXReader();
			Document doc = saxReader.read(new InputStreamReader(request.getInputStream())) ;
			OutputFormat format = new OutputFormat("    ", true);
			logger.info("3333333333333333333");
			//设置编码
			format.setEncoding("UTF-8");
			org.dom4j.io.XMLWriter dd=new  org.dom4j.io.XMLWriter();
			dd.write(doc);
			Element rootElement= doc.getDocument().getRootElement();
			String FromUserName = rootElement.element("FromUserName").getText();
			String ToUserName = rootElement.element("ToUserName").getText(); //xn.SelectSingleNode("//ToUserName").InnerText;
			String MsgType = rootElement.element("MsgType").getText();// xn.SelectSingleNode("//MsgType").InnerText;
			logger.info("消息MsgType="+MsgType);
			if(rootElement.element("Event")!=null){
				String Event = rootElement.element("Event").getText();
				logger.info("触发的事件为|"+Event);
				if (Event.equals("subscribe")){
					//获取access_token的值 --ayu
					String Access_token=wxApi.getAccessToken().getString("access_token");
					String  userinfo="";
					//注册用户 
					strresponse = strresponse + "<ToUserName><![CDATA[" + FromUserName + "]]></ToUserName>";
					strresponse = strresponse + "<FromUserName><![CDATA[" + ToUserName + "]]></FromUserName>";
					strresponse = strresponse + "<CreateTime>" + System.currentTimeMillis()+ "</CreateTime>)";
					strresponse = strresponse + "<MsgType><![CDATA[news]]></MsgType>";
					strresponse = strresponse + "<ArticleCount>1</ArticleCount>";
					strresponse = strresponse + "<Articles>";
						strresponse = strresponse + "<item>";
						strresponse = strresponse + "<Title><![CDATA[欢迎加入这里！]]></Title> ";
						strresponse = strresponse + "<Description><![CDATA[在这里，将为您提供前所未有的服务。]]></Description>";
						strresponse = strresponse + "<PicUrl><![CDATA[http://u16126435b.iok.la:18520/cx-admin/page/resources/images/logo.jpg]]></PicUrl>";
						strresponse = strresponse + "<Url><![CDATA[https://www.baidu.com]]></Url>";
						strresponse = strresponse + "</item>";
					strresponse = strresponse + "</Articles>";
					strresponse = strresponse + "</xml>";
					
					outPutStream.write(strresponse.getBytes("UTF-8"));
					outPutStream.flush();
					outPutStream.close();
				}else if(Event.equalsIgnoreCase("CLICK")){
					if(rootElement.element("EventKey")!=null){
						String EventKey = rootElement.element("EventKey").getText();
						logger.info("触发的事件KEY为|"+EventKey);
						if(StringUtils.equals(EventKey, "Key002_Tel")){
							strresponse = strresponse + "<xml><ToUserName><![CDATA[" + FromUserName + "]]></ToUserName>";
							strresponse = strresponse + "<FromUserName><![CDATA[" + ToUserName + "]]></FromUserName>";
							strresponse = strresponse + "<CreateTime>" + System.currentTimeMillis()+ "</CreateTime>)";
							strresponse = strresponse + "<MsgType><![CDATA[text]]></MsgType>";
							strresponse = strresponse + "<Content><![CDATA[客服电话：4006076333]]></Content>";
							strresponse = strresponse + "</xml>";
							outPutStream.write(strresponse.getBytes("UTF-8"));
							outPutStream.flush();
							outPutStream.close();
							logger.info("index.jsp|当触发Key002_Tel事件时给客户端发送内容如下客|服电话：4006076333");
						}
					}
				}
			}
		}catch(Exception err){
			logger.info("微信访问异常|"+err.getMessage());
		}
	}  
}
