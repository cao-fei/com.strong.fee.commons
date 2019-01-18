package com.strong.fee.cloudregester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudRegesterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudRegesterApplication.class, args);
    }
}
