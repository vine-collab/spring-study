package com.vine.boot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author tengyue(hk177955)
 * @date 2019-11-26 22:10
 */
@Data
public class MyConfigBean {

    @Value("${person.age}")
    private int age;

    @Value("${person.name}")
    private String name;
}
