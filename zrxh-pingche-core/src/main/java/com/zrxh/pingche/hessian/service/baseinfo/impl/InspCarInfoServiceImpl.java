package com.zrxh.pingche.hessian.service.baseinfo.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.caucho.hessian.client.HessianProxyFactory;
import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;
import com.zrxh.pingche.hessian.scanner.annotation.HessianService;
import com.zrxh.pingche.hessian.service.baseinfo.IInspCarInfoService;
import com.zrxh.pingche.tools.ParseResourceUtil;
import com.zrxh.pingche.tools.UUIDGenerator;
@Component
@HessianService("/carinfo")
public class InspCarInfoServiceImpl implements IInspCarInfoService {
	public final static String URL = "carinfo";
	@Override
	public int addInspCarInfo(InspCarInfo inspCarInfo) throws Exception {
		if(StringUtils.isEmpty(inspCarInfo.getId())){
			inspCarInfo.setId(UUIDGenerator.getUUID32());
		}
		HessianProxyFactory factory = new HessianProxyFactory();
		IInspCarInfoService hessianServer =    
	            (IInspCarInfoService)factory.create(IInspCarInfoService.class, ParseResourceUtil.getProperty(URL));
		
		return hessianServer.addInspCarInfo(inspCarInfo);
	}

	@Override
	public int updateInspCarInfo(InspCarInfo inspCarInfo) throws Exception {
		HessianProxyFactory factory = new HessianProxyFactory();
		IInspCarInfoService hessianServer =    
	            (IInspCarInfoService)factory.create(IInspCarInfoService.class, ParseResourceUtil.getProperty(URL));
		return hessianServer.updateInspCarInfo(inspCarInfo);
	}

	@Override
	public List<InspCarInfo> searchInspCarInfo(InspCarInfoExample inspCarInfoExample) throws Exception {
		HessianProxyFactory factory = new HessianProxyFactory();
		IInspCarInfoService hessianServer =    
	            (IInspCarInfoService)factory.create(IInspCarInfoService.class, ParseResourceUtil.getProperty(URL));
		return hessianServer.searchInspCarInfo(inspCarInfoExample);
	}

	@Override
	public InspCarInfo searchInspCarInfoByPK(String id) throws Exception {
		HessianProxyFactory factory = new HessianProxyFactory();
		IInspCarInfoService hessianServer =    
	            (IInspCarInfoService)factory.create(IInspCarInfoService.class, ParseResourceUtil.getProperty(URL));
		return hessianServer.searchInspCarInfoByPK(id);
	}

}
