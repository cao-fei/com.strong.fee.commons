package com.strong.fee.cloudconsumer.api;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;

public class SecurityTest {
    private Logger logger = LoggerFactory.getLogger(SecurityTest.class);

    @Test
    public void test001() {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 100; i++) {
            logger.info("" + secureRandom.nextLong());
        }

    }
}
