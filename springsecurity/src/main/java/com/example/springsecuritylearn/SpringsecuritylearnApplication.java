package com.example.springsecuritylearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springsecuritylearn.dao")
public class SpringsecuritylearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecuritylearnApplication.class, args);
    }

}
