package com.jerry.demo.springboot.mybatis.service.impl;

import com.jerry.demo.springboot.mybatis.domain.User;
import com.jerry.demo.springboot.mybatis.mapper.UserMapper;
import com.jerry.demo.springboot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(String name, Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userMapper.insert(user);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

}
