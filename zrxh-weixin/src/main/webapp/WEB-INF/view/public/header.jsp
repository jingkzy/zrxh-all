<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/tld/c.tld"%>
<%@ taglib prefix="fn" uri="/WEB-INF/tld/fn.tld"%>
<%@ taglib prefix="spring" uri="/WEB-INF/tld/spring.tld"%>
<%@ taglib uri="/WEB-INF/tld/spring-form.tld" prefix="form" %>
<%@ taglib uri="/WEB-INF/tld/fmt.tld" prefix="fmt" %>
<%@ page import="com.wukong.weixin.tools.ParseResourceUtil"%>
<c:set var="ctx" value='<%=ParseResourceUtil.getProperty("web.url")%>' />
<c:set var="frozenui" value="${ctx}static/frozenui-1.3.0" />
<c:set var="weixin" value="${ctx}static/weixin" />