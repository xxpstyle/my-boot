package com.example.myboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.myboot"})
public class MyBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBootApplication.class, args);
    }

}
