package com.strong.fee.kafka.receiver;

import com.strong.fee.kafka.sender.KafkaSender;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class KafkaReceiver {

    private Logger logger = LoggerFactory.getLogger(KafkaSender.class);
    @KafkaListener(topics = {"caofei"} ,groupId = "1")
    public void listen(ConsumerRecord<?, ?> record) {

        Optional<?> kafkaMessage = Optional.ofNullable(record.value());

        if (kafkaMessage.isPresent()) {

            Object message = kafkaMessage.get();

            logger.info("listen message =" + message);
        }

    }@KafkaListener(topics = {"caofei"} ,groupId = "1")
    public void listen1(ConsumerRecord<?, ?> record) {

        Optional<?> kafkaMessage = Optional.ofNullable(record.value());

        if (kafkaMessage.isPresent()) {

            Object message = kafkaMessage.get();

            logger.info("listen1 message =" + message);
        }

    }
    @KafkaListener(topics = {"caofei"} ,groupId = "2")
    public void listen2(ConsumerRecord<?, ?> record) {

        Optional<?> kafkaMessage = Optional.ofNullable(record.value());

        if (kafkaMessage.isPresent()) {

            Object message = kafkaMessage.get();
            logger.info("listen2  message =" + message);
        }

    }
}