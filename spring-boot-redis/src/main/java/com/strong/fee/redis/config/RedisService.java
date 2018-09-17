package com.strong.fee.redis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * author: 小殊
 * create: 2018/9/16 下午11:03
 */
@Component
public class RedisService {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void set(String key, String value) {
        redisTemplate.boundValueOps(key).set(value);
    }

    public String get(String key) {
        return redisTemplate.boundValueOps(key).get();
    }
}
