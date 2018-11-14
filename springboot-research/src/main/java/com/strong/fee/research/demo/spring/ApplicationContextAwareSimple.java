package com.strong.fee.research.demo.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextAwareSimple implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;
    private static Logger logger = LoggerFactory.getLogger(ApplicationContextAwareSimple.class);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextAwareSimple.applicationContext = applicationContext;
        logger.info("===========ApplicationContextAwareSimple 执行{}", applicationContext.getClass().getSimpleName());
    }


}
