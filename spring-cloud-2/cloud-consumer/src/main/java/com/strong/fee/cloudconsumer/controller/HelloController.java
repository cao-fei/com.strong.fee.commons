package com.strong.fee.cloudconsumer.controller;

import com.strong.fee.cloudconsumer.aop.Log;
import com.strong.fee.cloudconsumer.api.HelloServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloServiceClient client;
    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(String name) {
        return client.hello(name);
    }

    //    @Log
    public void helloA() {

        logger.info("====A=====");
        ((HelloController) AopContext.currentProxy()).doHelloB();
        logger.info("====A=====");
    }

    @Log
    public void doHelloB() {
        logger.info("doHello");
    }
}
