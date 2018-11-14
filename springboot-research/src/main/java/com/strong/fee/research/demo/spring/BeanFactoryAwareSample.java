package com.strong.fee.research.demo.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryAwareSample implements BeanFactoryAware {

    private static Logger logger = LoggerFactory.getLogger(BeanFactoryAwareSample.class);

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("===========BeanFactoryAwareSample 执行{}", beanFactory.getClass().getSimpleName());
    }
}
