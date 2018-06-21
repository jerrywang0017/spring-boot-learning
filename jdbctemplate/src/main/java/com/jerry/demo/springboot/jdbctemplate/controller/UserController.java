package com.jerry.demo.springboot.jdbctemplate.controller;

import com.jerry.demo.springboot.jdbctemplate.domain.User;
import com.jerry.demo.springboot.jdbctemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.list();
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String save(@ModelAttribute User user) {
        userService.save(user.getId(), user.getName(), user.getAge());
        return "success";
    }

}