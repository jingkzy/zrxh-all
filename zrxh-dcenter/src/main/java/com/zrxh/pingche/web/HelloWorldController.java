package com.zrxh.pingche.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.soap.service.HelloWordService;
@Controller
@RequestMapping("/test")
public class HelloWorldController {
	private final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	@Autowired
	HelloWordService helloWordService;
	@RequestMapping(value="/sayHi",method=RequestMethod.POST)
	@ResponseBody
	public String sayHi(String text){
		logger.info("text="+text);
		return helloWordService.sayHi(text);
	}
	@RequestMapping(value="/{carinfoid}")
    @ResponseBody
	public String searchInspCarInfoByPK(@PathVariable String carinfoid){
		logger.info("carinfoid="+carinfoid);
		InspCarInfo inspCarInfo = helloWordService.searchInspCarInfoByPK(carinfoid);
		if(inspCarInfo!=null){
			logger.info("busitype="+inspCarInfo.getBusinesstype());
		}
		return JSON.toJSONString(inspCarInfo);
	}
	@RequestMapping(value="/like/{like}")
    @ResponseBody
	public String searchInspCarInfo(@PathVariable String like){
		logger.info("like="+like);
		List<InspCarInfo> result = helloWordService.searchInspCarInfo(like);
		return JSON.toJSONString(result);
	}
}
