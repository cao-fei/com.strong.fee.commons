package com.strong.fee.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * author: 小殊
 * create: 2018/9/15 上午10:46
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterApplication {
    public static void main(String args[]) {
        SpringApplication.run(RegisterApplication.class, args);
    }

}
