package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yanglikun on 2017/8/15.
 */
@Configuration
public class TestConfig {

    @Value("${test.a}")
    private String val;

    public TestConfig() {

    }

    @Bean
    public String testBean() {
        System.out.println("testBean:" + val);
        return "aa";
    }
}
