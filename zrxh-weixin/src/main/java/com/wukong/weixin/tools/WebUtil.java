package com.wukong.weixin.tools;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * WebUtil 负责Cookie/Session等的管理。通常，所有对Cookie/Session的操作都通过此类来完成。 <br>
 * 
 * Session最终是采用 容器来管理，
 * 
 * @version 1.0
 */
@SuppressWarnings("all")
public class WebUtil {
	/***
	 * Cookie约定的名称
	 */
	// PropertiesUtil propertiesUtil =
	// PropertiesUtil.createPropertiesUtil("sso.properties");
	public static String tokenPName = "Token";// propertiesUtil.getProperty("cookieTokenName");
	public static String uIdPName = "UID";// t_user.id
	public static String subUserIdPName = "SubUserId";// 如：employee.id ,
	// member.id等
	public static String userIdPName = "UserId";// t_user.userId==loginName
	public static String niceNamePName = "NiceName";// t_user.name
	public static int maxAge = 60 * 60;// Integer.valueOf(propertiesUtil.getProperty("cookieage"));
	public static String path = "/";

	/**
	 * 根据名字从Session中获取一个对象
	 * 
	 * @param request HttpServletRequest对象
	 * @param name Session中对象的名字
	 * @return Object
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getObject(HttpServletRequest request, String name) {
		return (T) request.getSession().getAttribute(name);
	}

	/**
	 * 根据给定的name将一个对象保存到Session中
	 * 
	 * @param request HttpServletRequest对象
	 * @param name Session中对象的名字
	 * @param object 需要保存到Session的对象
	 */
	public static <T> void putObject(HttpServletRequest request, String name, T object) {
		request.getSession().setAttribute(name, object);
	}

	/**
	 * 将Session置为无效状态，通常在注销时调用
	 * 
	 * @param request HttpServletRequest
	 */
	public static void invalidateSession(HttpServletRequest request) {
		request.getSession().invalidate();
	}
	/**
	 * 将Session 去掉属性值
	 * 
	 * @param request HttpServletRequest
	 */
	public static void removeSessionAttr(HttpServletRequest request, String name) {
		request.getSession().removeAttribute(name);
	}

	/**
	 * 获取URI的路径,如路径为http://www.example.com/example/user.do?method=add,
	 * 得到的值为"/example/user.do"
	 * 
	 * @param request
	 * @return String
	 */
	public static String getRequestURI(HttpServletRequest request) {
		return request.getRequestURI();
	}

	/**
	 * 获取不包含应用名字的URI的路径, 并去掉最前面的"/", <br>
	 * 如路径为http://localhost:8080/appName/user/list.do,
	 * 得到的值为"user/list.do",其中appNames为应用的名字
	 * 
	 * @param request
	 * @return String
	 */
	public static String getNoAppNamedRequestURI(HttpServletRequest request) {
		String contextPath = request.getContextPath();
		String uri = request.getRequestURI();
		String realUri = uri.replace(contextPath, "");
		while (realUri.startsWith("/")) {
			realUri = realUri.substring(1);
		}
		realUri = realUri.replaceAll("/+", "/");
		return realUri;
	}

	/**
	 * 获取不包含应用名字的URI的路径 <br>
	 * 如路径为http://localhost:8080/appName/user/list.do,
	 * 得到的值为"user/list.do",其中appNames为应用的名字
	 * 
	 * @param request
	 * @return String
	 */
	public static String getNoAppNameRequestURI(HttpServletRequest request) {
		String contextPath = request.getContextPath();
		String uri = request.getRequestURI();
		String realUri = uri.replace(contextPath, "");
		while (realUri.startsWith("/")) {
			realUri = realUri.substring(1);
		}
		realUri = realUri.replaceAll("/+", "/");
		return "/" + realUri;
	}

	/**
	 * 获取应用的根目录
	 * 
	 * @param request
	 * @return
	 */
	public static String getContextPath(HttpServletRequest request) {
		String contextPath = request.getContextPath();
		if (contextPath.equals("/")) {
			return "";
		}
		return contextPath;
	}

	/**
	 * 过滤掉参数
	 * 
	 * @param url
	 * @return
	 */
	public static String getNoParamsUrl(String url) {
		if (url.length() > 0 && url.indexOf("?") > -1) {
			return url.substring(0, url.indexOf("?"));
		}
		return url;
	}

	/**
	 * 获取完整请求路径(含内容路径及请求参数)
	 * 
	 * @param request
	 * @return
	 */
	public static String getRequestURIWithParam(HttpServletRequest request) {
		return getRequestURI(request) + (request.getQueryString() == null ? "" : "?" + request.getQueryString());
	}

	/**
	 * 获取处理用户连接,拦截器用
	 * 
	 * @param request
	 * @param url
	 * @return
	 */
	public static String getUrl(HttpServletRequest request, String url) {
		StringBuffer forword = new StringBuffer();
		StringBuffer beginUrl = new StringBuffer();
		StringBuffer backUrl = new StringBuffer();
		beginUrl.append(url);
		Map<String, String[]> paramMap = request.getParameterMap();
		if (paramMap != null) {
			for (String s : paramMap.keySet()) {
				String[] value = paramMap.get(s);
				for (String val : value) {
					backUrl.append(s).append("=").append(val).append("&");
				}
			}
		}
		forword.append(beginUrl);
		if (backUrl.length() > 0) {
			forword.append("?").append(backUrl);
		}
		if (forword.length() > 1) {
			if (forword.substring(forword.length() - 1, forword.length()).indexOf("&") > -1) {
				return String.valueOf(forword.subSequence(0, forword.length() - 1));
			}
		}
		return String.valueOf(forword);
	}
	/**
	 * 去掉url中的路径，留下请求参数部分
	 * 
	 * @param strURL url地址
	 * @return url请求参数部分
	 */
	private static String truncateUrlPage(String strURL) {
		String strAllParam = null;
		String[] arrSplit = null;
		strURL = strURL.trim().toLowerCase();
		arrSplit = strURL.split("[?]");
		if (strURL.length() > 1) {
			if (arrSplit.length > 1) {
				if (arrSplit[1] != null) {
					strAllParam = arrSplit[1];
				}
			}
		}
		return strAllParam;
	}
	/**
	 * 解析出url参数中的键值对 如 "index.jsp?Action=del&id=123"，解析出Action:del,id:123存入map中
	 * 
	 * @param URL url地址
	 * @return url请求参数部分
	 */
	public static Map<String, String> getURLRequest(String URL) {
		Map<String, String> mapRequest = new HashMap<String, String>();
		String[] arrSplit = null;
		String strUrlParam = truncateUrlPage(URL);
		if (strUrlParam == null) {
			return mapRequest;
		}
		// 每个键值为一组
		arrSplit = strUrlParam.split("[&]");
		for (String strSplit : arrSplit) {
			String[] arrSplitEqual = null;
			arrSplitEqual = strSplit.split("[=]");
			// 解析出键值
			if (arrSplitEqual.length > 1) {
				// 正确解析
				mapRequest.put(arrSplitEqual[0], arrSplitEqual[1]);
			} else {
				if (arrSplitEqual[0] != "") {
					// 只有参数没有值，不加入
					mapRequest.put(arrSplitEqual[0], "");
				}
			}
		}
		return mapRequest;
	}
}
