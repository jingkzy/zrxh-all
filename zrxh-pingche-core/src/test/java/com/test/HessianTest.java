package com.test;

import java.net.MalformedURLException;
import java.util.List;

import org.junit.Test;
import org.springframework.util.StopWatch;

import com.caucho.hessian.client.HessianProxyFactory;
import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;

public class HessianTest {
	static{
		//System.setProperty("javax.net.ssl.trustStore", "d:\\home\\sso\\jinkzy.keystore");//注意是绝对路径  
		//System.setProperty("javax.net.ssl.keyStorePassword", "jinkzy");
	}
	public static void main(String arts[]) throws MalformedURLException {
		StopWatch clock = new StopWatch();
		clock.start();
		String url = "https://www.jinkzy.com/zrxh-pingche-core/carinfo.hessian";   
		HessianProxyFactory factory = new HessianProxyFactory();
		IInspCarInfoService hessianServer =    
	            (IInspCarInfoService)factory.create(IInspCarInfoService.class, url);
		InspCarInfoExample inspCarInfoExample = new InspCarInfoExample();
		InspCarInfoExample.Criteria abc = inspCarInfoExample.createCriteria();
		abc.andIdLike("%ab%");
		List<InspCarInfo> list = hessianServer.searchInspCarInfo(inspCarInfoExample);
		clock.stop();
		System.out.println("【"+clock.getTotalTimeMillis()+"】"+list.size());
	}
	@Test
	public void carinfo() throws Exception {
		StopWatch clock = new StopWatch();
		clock.start();
		String url = "https://www.jinkzy.com/zrxh-pingche-core/carinfo.hessian";   
		HessianProxyFactory factory = new HessianProxyFactory();
		IInspCarInfoService hessianServer =    
	            (IInspCarInfoService)factory.create(IInspCarInfoService.class, url);
		InspCarInfoExample inspCarInfoExample = new InspCarInfoExample();
		InspCarInfoExample.Criteria abc = inspCarInfoExample.createCriteria();
		abc.andIdLike("%ab%");
		List<InspCarInfo> list = hessianServer.searchInspCarInfo(inspCarInfoExample);
		clock.stop();
		System.out.println("【"+clock.getTotalTimeMillis()+"】"+list.size());
	}
}
