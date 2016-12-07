package com.wukong.weixin.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

@SuppressWarnings("all")
public class UserArgumentResolver implements WebArgumentResolver {
	private Logger logger = LoggerFactory.getLogger(UserArgumentResolver.class);

	public Object resolveArgument(MethodParameter methodParameter, NativeWebRequest webRequest) throws Exception {

		/*
		 * if (methodParameter.getParameterType().equals(CardOwner.class)) {
		 * HttpServletRequest request = (HttpServletRequest)
		 * webRequest.getNativeRequest(); CardOwner user =
		 * sessionService.getUser(request); if (user == null) { user = new
		 * CardOwner(); } return user; } else { return UNRESOLVED; }
		 */
		return UNRESOLVED;
	}
}