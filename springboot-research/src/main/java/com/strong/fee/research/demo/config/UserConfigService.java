package com.strong.fee.research.demo.config;

import com.strong.fee.research.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * author: 小殊
 * create: 2018/7/29 下午4:10
 */
@Configuration
@EnableAsync
public class UserConfigService implements ApplicationContextAware {

    private static Logger logger = LoggerFactory.getLogger(UserConfigService.class);

    @Autowired(required = false)
    List<IUserService> userServiceList;

    @PostConstruct
    public void before() {
        logger.info("before");
        for(IUserService i:userServiceList){
            logger.info(i.toString());
        }
    }

    @PreDestroy
    public void destroy() {
        logger.info("destroy");

        for(IUserService i:userServiceList){
            logger.info(i.toString());
        }

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
