package com.test;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Random;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.springframework.util.StopWatch;

import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;
import com.zrxh.pingche.soap.hello.HelloWorld;
import com.zrxh.pingche.tools.ParseResourceUtil;

public class SOAPTest {
	// 第一个参数为服务发布的targetNameSpace，可以通过查看对应的wsdl文件获得，默认是发布Service所在包的包名倒过来的形式；第二个参数是serviceName
	private final static QName SERVICE_NAME = new QName("http://hello.soap.pingche.zrxh.com/", "HelloWorldService");
	// 第一个参数是服务发布的targetNameSpace，第二个参数是portName
	private final static QName PORT_NAME = new QName("http://hello.soap.pingche.zrxh.com/", "HelloWorldPort");
	// 服务发布的地址
	private final static String ADDRESS = ParseResourceUtil.getProperty("helloword");
	static{
		System.setProperty("javax.net.ssl.trustStore", ParseResourceUtil.getProperty("keystore"));//注意是绝对路径  
		System.setProperty("javax.net.ssl.keyStorePassword", "jinkzy");
	}
	public static void main222(String[] args) throws Exception {
		for(int i=0;i<1;i++){
			StopWatch clock = new StopWatch();
			clock.start();
			Service service = Service.create(SERVICE_NAME);
			// 根据portName、服务发布地址、数据绑定类型创建一个Port。
			service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, ADDRESS);// 默认是SOAP1.1Binding
			// 获取服务
			HelloWorld hw = service.getPort(HelloWorld.class);
			
			Client proxy = ClientProxy.getClient(hw); 
			
			HTTPConduit http = (HTTPConduit)proxy.getConduit();
			HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
			httpClientPolicy.setConnectionTimeout(10000); // 连接超时
			httpClientPolicy.setAllowChunking(false); // 取消块编码
			httpClientPolicy.setReceiveTimeout(10000); // 响应超时
			http.setClient(httpClientPolicy);
			
			/*
			InspCarInfo a = hw.searchInspCarInfoByPK("004d611a414a454f98a1873b5968fa6a");
			System.out.println(a.getBusinesstype());
			System.out.println(hw.sayHi("good"));
			*/
			
			
			InspCarInfoExample inspCarInfoExample = new InspCarInfoExample();
			InspCarInfoExample.Criteria criteria = inspCarInfoExample.createCriteria();
			criteria.andIdLike("%ab%");
			List<InspCarInfo> list = hw.searchInspCarInfo(inspCarInfoExample);
			System.out.println(list.size());
			
			clock.stop();
			System.out.println(clock.getTotalTimeMillis());
		}
	}
	
	public static void main2222(String[] args) {
	    try {
	      FileInputStream fis = new FileInputStream("D://home//sso//uc.zrlh.net.crt");
	      CertificateFactory cf=CertificateFactory.getInstance("X509");
	      X509Certificate certificate=(X509Certificate) cf.generateCertificate(fis);
	      
	      System.out.println("Certficate for" + certificate.getSubjectDN());
	      System.out.println("Generated with "+certificate.getSigAlgName());
	      certificate.checkValidity();
	    }
	    catch (Exception ex) {
	    }
	}

	public static void main(String[] args) throws Exception {
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		for(int i=0;i<100;i++) {
			StopWatch clock = new StopWatch();
			clock.start();
			JaxWsProxyFactoryBean soapFactoryBean = new JaxWsProxyFactoryBean();
			soapFactoryBean.getInInterceptors().add(new LoggingInInterceptor());  
			soapFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());  
			System.out.println("*************** start ****************");
			
			soapFactoryBean.setAddress(ADDRESS);
			soapFactoryBean.setServiceClass(HelloWorld.class);
			
			HelloWorld hw = (HelloWorld) soapFactoryBean.create();
			Client proxy = ClientProxy.getClient(hw); 
			
			HTTPConduit http = (HTTPConduit)proxy.getConduit();
			HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
			httpClientPolicy.setConnectionTimeout(100); // 连接超时
			//httpClientPolicy.setAllowChunking(false); // 取消块编码
			httpClientPolicy.setReceiveTimeout(1000); // 响应超时
			http.setClient(httpClientPolicy);
			InspCarInfo inspCarInfoConf = new InspCarInfo();
			inspCarInfoConf.setId("004d611a414a454f98a1873b5968fa6a");
			inspCarInfoConf.setBusinesstype("测试");
			InspCarInfo tmp = hw.getById(inspCarInfoConf);
//			System.out.println(hw.sayHi("good"));
			InspCarInfoExample inspCarInfoExample = new InspCarInfoExample();
			InspCarInfoExample.Criteria  criteria = inspCarInfoExample.createCriteria();
			
			
		     Random random=new Random();
		     StringBuffer sb=new StringBuffer();
		     for(int j=0;j<1;j++){
		       int number=random.nextInt(62);
		       sb.append(str.charAt(number));
		     }
			
			criteria  = criteria.andIdLike("%"+sb.toString()+"%");
			inspCarInfoExample.setOredCriteria(inspCarInfoExample.getOredCriteria());
			List<InspCarInfo> list = hw.searchInspCarInfo(inspCarInfoExample);
			clock.stop();
			System.out.println("***************【"+clock.getTotalTimeMillis()+"】end【"+list.size()+"】****************");
		}
	}
	public static void main333(String[] args) throws MalformedURLException, Exception {
		StopWatch clock = new StopWatch();
		clock.start();
		JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
		Client clientTemp = clientFactory.createClient(ADDRESS);
		
		Object[] arg;
		List<InspCarInfo> result = null;
		try {

			/*
			 * HTTPConduit http = (HTTPConduit) clientTemp.getConduit();
			 * HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
			 * httpClientPolicy.setConnectionTimeout(10); // 连接超时
			 * httpClientPolicy.setAllowChunking(false); // 取消块编码
			 * httpClientPolicy.setReceiveTimeout(1000); // 响应超时
			 * http.setClient(httpClientPolicy);
			 */

			arg = clientTemp.invoke("searchInspCarInfo", new InspCarInfoExample());// 查询8698053在线状态，QQ号码
			// String，默认QQ号码：8698053。返回数据：String，Y
			// = 在线；N = 离线；E
			// = QQ号码错误；A =
			// 商业用户验证失败；V =
			// 免费用户超过数量
			//result = (List<InspCarInfo>) arg[0];
		} catch (Exception e) {
			e.printStackTrace();
		}
		clock.stop();
		System.out.println(clock.getTotalTimeMillis());
		System.out.println(clock.getTotalTimeSeconds());
	}
}
