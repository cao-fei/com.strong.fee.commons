package com.strong.fee.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: 小殊
 * create: 2018/9/15 下午10:46
 */
@RestController
@SpringBootApplication
public class SecurityApplication {

    public static void main(String args[]) {
        SpringApplication.run(SecurityApplication.class, args);
    }

    @RequestMapping(value = "hello")
    public String hello(String user) {
        return "hello world," + user;
    }

    @ModelAttribute
    public String user() {
        return "cao-fei";
    }
}
