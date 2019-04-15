package com.strong.fee.research.demo.controller;

import com.strong.fee.research.demo.entity.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * author: 小殊
 * create: 2018/7/28 下午12:20
 */
@RestController
public class WebHelloWorld {

    @RequestMapping("helloworld")
    public UserInfo helloWorld() {
        return new UserInfo();

    }

    @RequestMapping("hello")
    public String hello(HttpServletResponse response) throws Exception {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000L);
        }
        return "hello";
    }
}
