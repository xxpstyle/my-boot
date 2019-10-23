package com.example.myboot.web;

import com.example.myboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
   private UserDao userDao;

    @RequestMapping("/abc")
    public String hello(String name) {
        System.out.println(name);
        return userDao.listUser() + name;
    }
}
