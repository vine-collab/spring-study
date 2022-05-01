package com.vine.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cao
 * @date 2019-11-26 22:11
 */
@Configuration
public class MyConfig {
    @Bean
    public MyConfigBean myConfigBean() {
        return new MyConfigBean();
    }

}
