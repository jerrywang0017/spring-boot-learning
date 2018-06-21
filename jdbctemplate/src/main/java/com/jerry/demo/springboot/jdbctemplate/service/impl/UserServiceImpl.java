package com.jerry.demo.springboot.jdbctemplate.service.impl;

import com.jerry.demo.springboot.jdbctemplate.domain.User;
import com.jerry.demo.springboot.jdbctemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(Long id, String name, Integer age) {
        jdbcTemplate.update("insert into USER(ID,NAME,AGE) values(?,?,?)", id, name, age);
    }

    @Override
    public List<User> list() {
        List<User> users = new ArrayList<>();
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user");
        for (Map<String, Object> map : list) {
            User user = new User();
            user.setId(Long.parseLong(map.get("id").toString()));
            user.setName(map.get("name").toString());
            user.setAge(Integer.parseInt(map.get("age").toString()));
            users.add(user);
        }
        return users;

    }

}
