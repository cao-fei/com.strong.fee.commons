package com.strong.fee.research.demo.spring;

import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringTest {
    @Autowired
    private User user;
    @Autowired
    private Book book;

    @Test
    public void test001() {

    }
}
