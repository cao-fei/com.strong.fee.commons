package com.strong.fee.research.demo.controller;

import com.strong.fee.research.demo.entity.UserInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;

/**
 * author: 小殊
 * create: 2018/7/28 下午4:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebHelloWorldTest {

    private Logger logger = LoggerFactory.getLogger(WebHelloWorldTest.class);
    @Autowired
    private TestRestTemplate template;

//    @LocalServerPort
//    private int port;

    private URI uri;

    @Before
    public void init() throws Exception {
        uri = new URI("http://localhost:8080/helloworld");
    }

    @Test
    public void testHelloWorld() {
        logger.info(template.getForEntity(uri, UserInfo.class).getBody().toString());
    }
}
