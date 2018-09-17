package com.strong.fee.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: 小殊
 * create: 2018/9/17 上午11:37
 */
@RestController
public class Service2Controller {
    @RequestMapping("hello")
    public String hello(){
        return "hello service2";
    }
}
