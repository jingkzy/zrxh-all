package com.zrxh.pingche.hession.service.baseinfo.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.TriggersRemove;
import com.googlecode.ehcache.annotations.When;
import com.zrxh.pingche.data.dao.InspCarInfoMapper;
import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;
import com.zrxh.pingche.hession.scanner.annotation.HessianService;
import com.zrxh.pingche.hession.service.baseinfo.IInspCarInfoService;
@Component
@HessianService(value="/carinfo")
public class InspCarInfoServiceImpl implements IInspCarInfoService {
	private Logger logger = LoggerFactory.getLogger(InspCarInfoServiceImpl.class);
	private static final String CACHE_NAME = "carinfo";
	@Autowired
	private InspCarInfoMapper inspCarInfoMapper;

	@Override
	@TriggersRemove(cacheName=CACHE_NAME, when=When.AFTER_METHOD_INVOCATION, removeAll=true) 
	public int addInspCarInfo(InspCarInfo inspCarInfo) throws Exception {
		try{
			return inspCarInfoMapper.insertSelective(inspCarInfo);
		}catch(Exception ex){
			throw ex;
		}
	}

	@Override
	@TriggersRemove(cacheName=CACHE_NAME, when=When.AFTER_METHOD_INVOCATION, removeAll=true) 
	public int updateInspCarInfo(InspCarInfo inspCarInfo) throws Exception {
		try{
			return inspCarInfoMapper.updateByPrimaryKeySelective(inspCarInfo);
		}catch(Exception ex){
			throw ex;
		}
	}

	@Override
	@Cacheable(cacheName=CACHE_NAME)
	public List<InspCarInfo> searchInspCarInfo(InspCarInfoExample inspCarInfoExample) throws Exception {
		try{
			return inspCarInfoMapper.selectByExample(inspCarInfoExample);
		}catch(Exception ex){
			throw ex;
		}
	}

	@Override
	@Cacheable(cacheName=CACHE_NAME)
	public InspCarInfo searchInspCarInfoByPK(String id) throws Exception {
		try{
			return inspCarInfoMapper.selectByPrimaryKey(id);
		}catch(Exception ex){
			throw ex;
		}
	}

}
