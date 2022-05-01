package com.vine.boot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author cao
 * @date 2019-11-26 22:10
 */
@Data
public class MyConfigBean {

    @Value("${person.age}")
    private int age;

    @Value("${person.name}")
    private String name;
}
