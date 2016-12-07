package com.zrxh.pingche.hession.service.test.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zrxh.pingche.hession.service.test.IHelloService;
import com.zrxh.pingche.hession.service.test.ISayService;

@Component
public class SayService implements ISayService {

    @Autowired
    private IHelloService service;
    public void ping() {
        
        System.out.println("Hello");
    }

    
}
