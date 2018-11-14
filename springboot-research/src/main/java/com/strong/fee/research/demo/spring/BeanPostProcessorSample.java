package com.strong.fee.research.demo.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessorSample implements BeanPostProcessor {

    private static Logger logger = LoggerFactory.getLogger(BeanPostProcessorSample.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //logger.info("=========BeanPostProcessorSample before:{}",beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //logger.info("=========BeanPostProcessorSample after:{}",beanName);
        return bean;
    }
}
