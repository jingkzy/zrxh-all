package com.zrxh.pingche.hession.service.baseinfo;

import java.util.List;

import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;

public interface IInspCarInfoService {
	//添加车辆信息
	public int addInspCarInfo(InspCarInfo inspCarInfo) throws Exception;
	//更新车辆信息
	public int updateInspCarInfo(InspCarInfo inspCarInfo) throws Exception;
	//根据条件搜索车辆信息
	public List<InspCarInfo> searchInspCarInfo(InspCarInfoExample inspCarInfoExample) throws Exception;
	//根据ID搜索车辆
	public InspCarInfo searchInspCarInfoByPK(String id) throws Exception;
}
