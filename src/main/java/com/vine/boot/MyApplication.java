package com.vine.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.annotation.PostConstruct;

/**
 * @author cao
 * @date 2019-11-24 22:34
 */
@SpringBootApplication
@ServletComponentScan
public class MyApplication {

    private static final Logger log = LoggerFactory.getLogger(MyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

//    @PostConstruct
//    public void myLog(){
//        log.trace("trace msg");
//        log.debug("debug msg");
//        log.info("info msg");
//        log.warn("warn msg");
//        log.error("error msg");
//    }
}
