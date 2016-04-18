package com.zrxh.pingche.soap.hello;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.cxf.jaxws.javaee.ObjectFactory;

import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;

@WebService(targetNamespace = "http://hello.soap.pingche.zrxh.com/")
@XmlSeeAlso(value = {ObjectFactory.class})
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {
	@WebResult(name = "return", targetNamespace = "http://hello.soap.pingche.zrxh.com/", partName = "return")
    @WebMethod
    String sayHi(String text);
	@WebResult(name = "return", targetNamespace = "http://hello.soap.pingche.zrxh.com/", partName = "return")
    @WebMethod
	InspCarInfo getById(InspCarInfo inspCarInfoConf);
	@WebResult(name = "return", targetNamespace = "http://hello.soap.pingche.zrxh.com/", partName="inspCarInfo")
    @WebMethod
	public List<InspCarInfo> searchInspCarInfo(InspCarInfoExample inspCarInfoExample) throws Exception;
	@WebResult(name = "return", targetNamespace = "http://hello.soap.pingche.zrxh.com/", partName = "inspCarInfo")
    @WebMethod
    public InspCarInfo searchInspCarInfoByPK(String id) throws Exception;
}