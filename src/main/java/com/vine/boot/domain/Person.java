package com.vine.boot.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author hk
 * @date 2019-11-24 22:40
 */
@Data
@Builder
public class Person {

    private int age;

    private String name;

}
