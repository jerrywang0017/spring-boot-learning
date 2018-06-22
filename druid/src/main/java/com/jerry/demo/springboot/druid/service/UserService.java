package com.jerry.demo.springboot.druid.service;

import com.jerry.demo.springboot.druid.domain.User;

import java.util.List;

public interface UserService {

    void insert(String name, Integer age);

    User findById(Integer id);

    List<User> list();

}
