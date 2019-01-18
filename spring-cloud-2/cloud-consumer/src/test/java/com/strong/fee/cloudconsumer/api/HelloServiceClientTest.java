package com.strong.fee.cloudconsumer.api;

import com.strong.fee.cloudconsumer.controller.AopController;
import com.strong.fee.cloudconsumer.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceClientTest {
    @Autowired
    private HelloServiceClient client;
    @Autowired
    private HelloController helloController;
    @Autowired
    private AopController aopController;
    private static Logger logger = LoggerFactory.getLogger(HelloServiceClientTest.class);

    @Test
    public void test001() {
        logger.info(client.hello("test"));
    }

    @Test
    public void test002() {
//        aopController.helloA();
//        logger.info("=======1");
        helloController.helloA();
//        logger.info("=======2");
//        test00201();
//        logger.info("=======3");
//        helloController.doHelloB();
    }

    private void test00201() {

        helloController.doHelloB();
    }
}
