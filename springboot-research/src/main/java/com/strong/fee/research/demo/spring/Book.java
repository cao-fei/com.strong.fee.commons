package com.strong.fee.research.demo.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Book implements BeanNameAware, BeanFactoryAware, InitializingBean {


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("===========book: BeanFactoryAwareSample 执行{}", beanFactory.getClass().getSimpleName());
    }

    @Override
    public void setBeanName(String name) {
        logger.info("===========book:BeanNameAwareSample 执行{}", name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    private static Logger logger = LoggerFactory.getLogger(Book.class);

    public Book() {
        logger.info("===========Book创建");
    }
}
