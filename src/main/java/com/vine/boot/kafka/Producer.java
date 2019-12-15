package com.vine.boot.kafka;

import com.google.gson.Gson;
import com.vine.boot.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * 消息生产者
 *
 * @author tengyue(hk177955)
 * @date 2019-12-15 18:18
 */
@Component
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(Person person){
        kafkaTemplate.send("my_topic", new Gson().toJson(person));
    }
}
