package com.zrxh.pingche.hession.service.test.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zrxh.pingche.data.dao.InspCarInfoMapper;
import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;
import com.zrxh.pingche.hession.scanner.annotation.HessianService;
import com.zrxh.pingche.hession.service.test.IHelloService;

@Component
@HessianService(value="/test/hello")
public class HelloService implements IHelloService {
	private Logger logger = LoggerFactory.getLogger(HelloService.class);
	@Autowired
	private InspCarInfoMapper inspCarInfoMapper;
    public String say(String name){
    	PageHelper.startPage(1, 20);
    	InspCarInfoExample inspCarInfoExample = new InspCarInfoExample();
    	inspCarInfoExample.setOrderByClause("updatetime desc");
    	InspCarInfoExample.Criteria criteria = inspCarInfoExample.createCriteria();
    	criteria.andIdLike("%a%");
        List<InspCarInfo> list = inspCarInfoMapper.selectByExample(inspCarInfoExample);
        PageInfo<InspCarInfo> page = new PageInfo<InspCarInfo>(list);
        logger.info("size="+page.getSize());
        return "Hello," + name + ","+inspCarInfoMapper;
    }
	@Override
	public InspCarInfo getOne() {
		return inspCarInfoMapper.selectByPrimaryKey("004d611a414a454f98a1873b5968fa6a");
	}

}
