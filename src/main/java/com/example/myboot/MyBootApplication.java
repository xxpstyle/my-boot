package com.example.myboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
@MapperScan(basePackages = {"com.example.dao"})
public class MyBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBootApplication.class, args);
    }

}
