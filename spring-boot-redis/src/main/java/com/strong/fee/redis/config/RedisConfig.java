//package com.strong.fee.redis.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.StringRedisTemplate;
//
///**
// * author: 小殊
// * create: 2018/9/16 下午11:10
// */
//@Configuration
//public class RedisConfig {
//
//    @Autowired
//    private RedisProperties properties;
//
//    @ConditionalOnMissingBean(name="redisTemplate")
//
//    @Bean
//    public StringRedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory ){
//        StringRedisTemplate template = new StringRedisTemplate();
//        template.setConnectionFactory(redisConnectionFactory);
//        return template;
//    }
//    @ConditionalOnMissingBean(name="redisConnectionFactory")
//
//    @Bean
//    public RedisConnectionFactory redisConnectionFactory() {
//        RedisStandaloneConfiguration redisStandaloneConfiguration=new RedisStandaloneConfiguration();
//
//        redisStandaloneConfiguration.setHostName(properties.getHost());
//        redisStandaloneConfiguration.setDatabase(properties.getDatabase());
//        redisStandaloneConfiguration.setPassword(properties.getPassword());
//        redisStandaloneConfiguration.setPort(properties.getPort());
//        JedisConnectionFactory factory = new JedisConnectionFactory(redisStandaloneConfiguration);
//        factory.setTimeout(properties.get.getTimeout());
//        factory.setUsePool(true);
//        logger.info("============redis配置:"+ JsonUtil.entity2Json(properties));
//        return factory;
//    }
//}
