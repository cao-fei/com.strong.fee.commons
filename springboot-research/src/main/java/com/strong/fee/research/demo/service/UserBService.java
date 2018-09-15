package com.strong.fee.research.demo.service;

import com.strong.fee.research.demo.config.UserConfigService;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * author: 小殊
 * create: 2018/7/29 下午4:07
 */

@Profile("dev")
@Service
@Data
public class UserBService implements IUserService {
    private Integer value = (int) (Math.random() * 1000);

    private static Logger logger = LoggerFactory.getLogger(UserBService.class);

    @PostConstruct
    public void before() {
        logger.info("user before");

    }

    @Override
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @PreDestroy
    public void destroy() {
        logger.info("user destroy");


    }
}
