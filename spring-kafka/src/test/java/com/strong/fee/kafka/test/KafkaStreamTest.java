package com.strong.fee.kafka.test;


import com.strong.fee.kafka.stream.KafkaStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class KafkaStreamTest {
    @Autowired
    private KafkaStream kafkaStream;
    @Test
    public void test001(){
        kafkaStream.execute();
    }
}
