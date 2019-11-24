package com.vine.boot.controller;

import com.vine.boot.domain.Person;
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

    @GetMapping(value = "/person")
    public Person getPerson(){
        return Person.builder()
                .age(18)
                .name("sam")
                .build();
    }
}
