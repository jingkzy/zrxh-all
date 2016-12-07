package com.zrxh.pingche.soap.service;

import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;
import com.zrxh.pingche.soap.hello.HelloWorld;
import com.zrxh.pingche.tools.ParseResourceUtil;
@Service
public class HelloWordService {
	public final static String URL = "helloword";
	public final static String KEYSTORE = "keystore";
	private final Logger logger = LoggerFactory.getLogger(HelloWordService.class);
	static{
		System.setProperty("javax.net.ssl.trustStore", ParseResourceUtil.getProperty(KEYSTORE));//注意是绝对路径  
		System.setProperty("javax.net.ssl.keyStorePassword", "jinkzy");
	}
	public String sayHi(String text){
		JaxWsProxyFactoryBean soapFactoryBean = new JaxWsProxyFactoryBean();
		logger.info("*************** start ****************");
		StopWatch clock = new StopWatch();
		clock.start();
		soapFactoryBean.setAddress(ParseResourceUtil.getProperty(URL));
		soapFactoryBean.setServiceClass(HelloWorld.class);
		HelloWorld hw = (HelloWorld) soapFactoryBean.create();
		String result = hw.sayHi(text);
		clock.stop();
		logger.info("***************end["+clock.getTotalTimeMillis()+"]****************");
		return result;
	}
	
	public InspCarInfo searchInspCarInfoByPK(String id){
		try{
			System.out.println(System.getProperty("javax.net.ssl.trustStore"));
			System.out.println(System.getProperty("javax.net.ssl.keyStorePassword"));
			JaxWsProxyFactoryBean soapFactoryBean = new JaxWsProxyFactoryBean();
			logger.info("*************** start ****************");
			StopWatch clock = new StopWatch();
			clock.start();
			soapFactoryBean.setAddress(ParseResourceUtil.getProperty(URL));
			soapFactoryBean.setServiceClass(HelloWorld.class);
			HelloWorld hw = (HelloWorld) soapFactoryBean.create();
			InspCarInfo result = hw.searchInspCarInfoByPK(id);
			clock.stop();
			logger.info("***************end["+clock.getTotalTimeMillis()+"]****************");
			return result;
		}catch(Exception err){
			err.printStackTrace();
			return null;
		}
	}
	
	public List<InspCarInfo> searchInspCarInfo(String like){
		try{
			JaxWsProxyFactoryBean soapFactoryBean = new JaxWsProxyFactoryBean();
			logger.info("*************** start ****************");
			StopWatch clock = new StopWatch();
			clock.start();
			soapFactoryBean.setAddress(ParseResourceUtil.getProperty(URL));
			soapFactoryBean.setServiceClass(HelloWorld.class);
			HelloWorld hw = (HelloWorld) soapFactoryBean.create();
			
			InspCarInfoExample inspCarInfoExample = new InspCarInfoExample();
			InspCarInfoExample.Criteria  criteria = inspCarInfoExample.createCriteria();
			
			criteria  = criteria.andIdLike("%"+like+"%");
			inspCarInfoExample.setOredCriteria(inspCarInfoExample.getOredCriteria());
			
			List<InspCarInfo> result = hw.searchInspCarInfo(inspCarInfoExample);
			clock.stop();
			logger.info("***************end["+clock.getTotalTimeMillis()+"]****************");
			return result;
		}catch(Exception err){
			err.printStackTrace();
			return null;
		}
	}
	
}
