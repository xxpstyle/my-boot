package com.example.controller;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(String name) {
        return "name:" + name;
    }

    @RequestMapping("/index2")
    public String index2(String name) {
        return "name:" + userService.list().toString();
    }
}
