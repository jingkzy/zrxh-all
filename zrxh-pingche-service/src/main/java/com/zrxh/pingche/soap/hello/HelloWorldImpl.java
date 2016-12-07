package com.zrxh.pingche.soap.hello;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;
import com.zrxh.pingche.hessianservice.baseinfo.IInspCarInfoService;

@WebService(targetNamespace="http://hello.soap.pingche.zrxh.com/",endpointInterface = "com.zrxh.pingche.soap.hello.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	@Autowired
	private IInspCarInfoService iInspCarInfoService;
	public HelloWorldImpl()  
    {  
        System.out.println("--  init HelloWorldImpl --");  
    }
	@Override
    public String sayHi(String text) {
        System.out.println("sayHi "+text+","+iInspCarInfoService);
        return "Hello " + text;
    }
	@Override
	public InspCarInfo getById(InspCarInfo inspCarInfoConf) {
		System.out.println("getById "+inspCarInfoConf.getId());
		InspCarInfo inspCarInfo = new InspCarInfo();
		inspCarInfo.setId(inspCarInfoConf.getId());
		return inspCarInfo;
	}
	@Override
	public List<InspCarInfo> searchInspCarInfo(InspCarInfoExample inspCarInfoExample) throws Exception {
		List<InspCarInfo> lists = iInspCarInfoService.searchInspCarInfo(inspCarInfoExample);
		return lists;
	}
	@Override
	public InspCarInfo searchInspCarInfoByPK(String id) throws Exception {
		return iInspCarInfoService.searchInspCarInfoByPK(id);
	}
}