package com.vine.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author cao
 * @date 2019-11-24 22:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person implements Serializable {


    private static final long serialVersionUID = -9108595519590138339L;


    private int age;

    private String name;

    private String nick;

}
