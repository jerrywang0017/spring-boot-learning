package com.jerry.demo.springboot.jdbctemplate.service.impl;

import com.jerry.demo.springboot.jdbctemplate.domain.User;
import com.jerry.demo.springboot.jdbctemplate.service.UserService;
import com.jerry.demo.springboot.jdbctemplate.service.mapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(String name, Integer age) {
        jdbcTemplate.update("insert into USER(NAME,AGE) values(?,?)", name, age);
    }

    @Override
    public User findById(Integer id) {
        User user = jdbcTemplate.queryForObject("select * from user where id = ?", new UserRowMapper(), id);
        return user;
    }

    @Override
    public List<User> list() {
        return jdbcTemplate.query("select * from user", new UserRowMapper());
    }

}
