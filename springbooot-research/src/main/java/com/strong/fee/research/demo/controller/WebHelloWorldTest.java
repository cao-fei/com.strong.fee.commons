package com.strong.fee.research.demo.controller;

import com.strong.fee.research.demo.entity.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: 小殊
 * create: 2018/7/28 下午12:20
 */
@RestController
public class WebHelloWorldTest {

    @RequestMapping("helloworld")
    public UserInfo helloWorld() {
        return new UserInfo();

    }
}
