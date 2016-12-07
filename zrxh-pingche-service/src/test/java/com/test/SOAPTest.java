package com.test;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class SOAPTest {
	public static void main(String[] args) {
		JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory  
                .newInstance();  
        String url = "http://localhost:18080/zrxh-pingche-service/services/helloWordService?wsdl";// http://www.fjyxd.com:17001/DefDispatcher/dispatche?wsdl  
        org.apache.cxf.endpoint.Client clientTemp = clientFactory.createClient(url);  
        Object[] arg;  
        String result = "";  
        try {  
            arg = clientTemp.invoke("sayHi", "8698053");// 查询8698053在线状态，QQ号码  
            // String，默认QQ号码：8698053。返回数据：String，Y  
            // = 在线；N = 离线；E  
            // = QQ号码错误；A =  
            // 商业用户验证失败；V =  
            // 免费用户超过数量  
            result = (String) arg[0];  
        } catch (Exception e) {  
            e.printStackTrace();  
        }
	}
}
