package com.zrxh.pingche.hessian.scanner;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TraceInterceptor implements MethodInterceptor {
	private Logger logger = LoggerFactory.getLogger(TraceInterceptor.class);
	public Object invoke(MethodInvocation invocation) throws Throwable {
		logger.info("***************** start *****************");
		try{
			Object[] params = invocation.getArguments();
			//logger.info("params="+params);
			Object result = invocation.proceed();
			//logger.info("result="+result);
			return result;
		}catch(Exception ex){
			throw ex;
		}finally{
			logger.info("*****************  end  *****************");
		}
	}

	
}
