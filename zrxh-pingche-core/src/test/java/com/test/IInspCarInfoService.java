package com.test;

import java.util.List;

import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;

public interface IInspCarInfoService {
	public int addInspCarInfo(InspCarInfo inspCarInfo);
	
	public int updateInspCarInfo(InspCarInfo inspCarInfo);
	
	public List<InspCarInfo> searchInspCarInfo(InspCarInfoExample inspCarInfoExample);
	
	public InspCarInfo searchInspCarInfoByPK(String id);
}
