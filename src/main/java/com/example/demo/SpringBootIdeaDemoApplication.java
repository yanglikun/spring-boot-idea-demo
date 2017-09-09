package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.jd.xn.autoloadproperties.ImportProperties;

@SpringBootApplication
@ImportProperties(locations = {"classpath:a.properties"})
//@PropertySource("classpath:a.properties")
public class SpringBootIdeaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootIdeaDemoApplication.class, args);
    }
}
