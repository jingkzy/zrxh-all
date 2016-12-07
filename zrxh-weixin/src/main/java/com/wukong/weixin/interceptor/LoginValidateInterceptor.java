package com.wukong.weixin.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.wukong.weixin.tools.WebUtil;



public class LoginValidateInterceptor extends HandlerInterceptorAdapter {
	// 不需要检查的URL
	private List<String> uncheckedUrls;
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object target) throws Exception {
		String realUri = WebUtil.getNoAppNameRequestURI(request);
		
		if (uncheckedUrls != null && !uncheckedUrls.isEmpty() && uncheckedUrls.contains(realUri)) {
			return true;
		}
		/*JSONObject object = (JSONObject)request.getSession().getAttribute("openid");
		if (object == null) {
			response.sendRedirect(ParseResourceUtil.getProperty("web.url") + "busi/bind");
			return false;
		}*/
		return true;
	}

	public void setUncheckedUrls(List<String> uncheckedUrls) {
		this.uncheckedUrls = uncheckedUrls;
	}
}
