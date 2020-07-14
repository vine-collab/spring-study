package com.vine.boot.kafka;

import com.google.gson.Gson;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 *
 * @author tengyue(hk177955)
 * @date 2019-12-15 18:23
 */
//@Component
public class KafkaConsumer {

//    @KafkaListener(topics = "my_topic", groupId = "my_group")
    public void consume(ConsumerRecord<String, String > record){
        String s = new Gson().toJson(record).toString();
        System.out.println(s);
    }
}
