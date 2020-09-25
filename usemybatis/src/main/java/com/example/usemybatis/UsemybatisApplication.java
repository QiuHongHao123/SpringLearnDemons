package com.example.usemybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.usemybatis.mapper") //扫描的mapper
@SpringBootApplication
public class UsemybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsemybatisApplication.class, args);
    }

}
