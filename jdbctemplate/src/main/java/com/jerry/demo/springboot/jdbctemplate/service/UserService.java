package com.jerry.demo.springboot.jdbctemplate.service;

import com.jerry.demo.springboot.jdbctemplate.domain.User;

import java.util.List;

public interface UserService {

    void insert(String name, Integer age);

    User findById(Integer id);

    List<User> list();

}
