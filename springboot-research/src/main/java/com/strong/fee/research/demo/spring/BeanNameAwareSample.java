package com.strong.fee.research.demo.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class BeanNameAwareSample implements BeanNameAware {
    private static Logger logger = LoggerFactory.getLogger(BeanNameAwareSample.class);

    @Override
    public void setBeanName(String name) {
        logger.info("===========BeanNameAwareSample 执行{}", name);
    }

}
