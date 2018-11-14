package com.strong.fee.kafka.sender;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.strong.fee.kafka.domain.Message;
import com.strong.fee.util.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.Date;
import java.util.UUID;

@Component
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Gson gson = new GsonBuilder().create();
    private Logger logger = LoggerFactory.getLogger(KafkaSender.class);

    //发送消息方法
    public void send() {
        Message message = new Message();
        message.setId(System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());
        logger.info("+++++++++++++++++++++  message = {}", gson.toJson(message));
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("caofei", gson.toJson(message));
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onFailure(Throwable ex) {
                logger.info("发送失败", ex);
            }

            @Override
            public void onSuccess(SendResult<String, String> result) {
                logger.info("发送成功"+JsonUtil.toJson(result.getProducerRecord().value()));
            }
        });
        try {
            future.get();
        } catch (Exception ex) {
        }

    }
}