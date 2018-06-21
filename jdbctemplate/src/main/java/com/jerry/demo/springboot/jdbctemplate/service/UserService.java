package com.jerry.demo.springboot.jdbctemplate.service;

import com.jerry.demo.springboot.jdbctemplate.domain.User;

import java.util.List;

public interface UserService {

    void save(Long id, String name, Integer age);

    List<User> list();

}
