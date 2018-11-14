package com.strong.fee.research.demo.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class User implements BeanNameAware {

    @Override
    public void setBeanName(String name) {
        logger.info("===========user:BeanNameAwareSample 执行{}", name);
    }

    private static Logger logger = LoggerFactory.getLogger(User.class);

    public User() {
        logger.info("===========user创建");
    }
}
