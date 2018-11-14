package com.strong.fee.kafka.test;

import com.strong.fee.kafka.sender.KafkaSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class KafkaSenderTest {
    @Autowired
    private KafkaSender sender;
    @Test
    public void test001() {
        for(int i=0;i<2;i++){
            sender.send();
        }
    }
}
