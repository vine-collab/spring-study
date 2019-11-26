package com.vine.boot.controller;

import com.vine.boot.config.MyConfigBean;
import com.vine.boot.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.ref.SoftReference;

/**
 * @author hk
 * @date 2019-11-24 22:39
 */
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {


    @Autowired
    private MyConfigBean myConfigBean;

    @GetMapping(value = "/person")
    public Person getPerson() {

        System.out.println(myConfigBean);
        return Person.builder()
                .age(18)
                .name("sam")
                .build();
    }


}
