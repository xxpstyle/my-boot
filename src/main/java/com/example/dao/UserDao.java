package com.example.dao;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> listUser();
}
