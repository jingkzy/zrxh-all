package com.zrxh.pingche.soap.hello.impl;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;
import com.zrxh.pingche.hessianservice.baseinfo.IInspCarInfoService;
import com.zrxh.pingche.soap.hello.HelloWorld;

@WebService(targetNamespace="http://hello.soap.pingche.zrxh.com/",endpointInterface = "com.zrxh.pingche.soap.hello.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	@Autowired
	private IInspCarInfoService iInspCarInfoService;
	public HelloWorldImpl()  
    {  
        System.out.println("--  init HelloWorldImpl --");  
    }  
    public String sayHi(String text) {
        System.out.println("sayHi "+text);
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
	@WebResult(name = "return", targetNamespace = "http://hello.soap.pingche.zrxh.com/", partName = "return")
	@WebMethod
	public List<InspCarInfo> searchInspCarInfo(@WebParam(name="inspCarInfoExample",targetNamespace="http://hello.soap.pingche.zrxh.com/")InspCarInfoExample inspCarInfoExample) throws Exception {
		return iInspCarInfoService.searchInspCarInfo(inspCarInfoExample);
	}
	@Override
	public InspCarInfo searchInspCarInfoByPK(String id) throws Exception {
		return iInspCarInfoService.searchInspCarInfoByPK(id);
	}
}