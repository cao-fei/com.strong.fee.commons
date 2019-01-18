package com.strong.fee.cloudconsumer.api;

import com.strong.fee.servicedefinition.def.HelloServiceDef;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("provider")
public interface HelloServiceClient extends HelloServiceDef {

}
