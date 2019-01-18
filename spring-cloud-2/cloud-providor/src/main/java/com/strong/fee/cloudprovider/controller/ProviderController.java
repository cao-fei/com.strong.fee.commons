package com.strong.fee.cloudprovider.controller;

import com.strong.fee.servicedefinition.def.HelloServiceDef;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController implements HelloServiceDef {
    public String hello(@RequestParam("name") String name) {
        return String.format("hello,%s", name);

    }
}
