package com.vine.boot.controller;

import com.vine.boot.config.MyConfigBean;
import com.vine.boot.domain.Person;
import com.vine.boot.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hk
 * @date 2019-11-24 22:39
 */
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {


    @Autowired
    private MyConfigBean myConfigBean;

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping(value = "/person")
    public Person getPerson() {

        System.out.println(myConfigBean);
        return Person.builder()
                .age(18)
                .name("sam")
                .build();
    }

    @GetMapping(value = "/kafka")
    public Person sendMsg() {

        Person sam = Person.builder()
                .age(18)
                .name("sam")
                .build();
        kafkaProducer.send(sam);

        return sam;
    }

}
