package com.zrxh.pingche.hessianservice.baseinfo;

import java.util.List;

import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;

public interface IInspCarInfoService {
	public int addInspCarInfo(InspCarInfo inspCarInfo) throws Exception;
	
	public int updateInspCarInfo(InspCarInfo inspCarInfo) throws Exception;
	
	public List<InspCarInfo> searchInspCarInfo(InspCarInfoExample inspCarInfoExample) throws Exception;
	
	public InspCarInfo searchInspCarInfoByPK(String id) throws Exception;
}
