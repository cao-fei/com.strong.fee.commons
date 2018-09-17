package com.strong.fee.redis;

import com.strong.fee.redis.config.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * author: 小殊
 * create: 2018/9/16 下午11:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServerTest {

    private Logger logger = LoggerFactory.getLogger(RedisServerTest.class);
    @Autowired
    RedisService redisService;

    @Test
    public void test001() {
        redisService.set("test1", "12345");

        logger.info(redisService.get("test1"));
    }
}
