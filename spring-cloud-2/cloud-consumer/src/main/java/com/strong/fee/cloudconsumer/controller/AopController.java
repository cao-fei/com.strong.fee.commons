package com.strong.fee.cloudconsumer.controller;

import com.strong.fee.cloudconsumer.aop.Log;
import com.strong.fee.cloudconsumer.api.HelloServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {
    @Autowired
    private HelloController controller;
    private Logger logger = LoggerFactory.getLogger(AopController.class);


    public void helloA() {

        logger.info("====A=====");
        controller.doHelloB();
        logger.info("====A=====");
    }
}
