package com.jerry.demo.springboot.druid.controller;

import com.jerry.demo.springboot.druid.domain.User;
import com.jerry.demo.springboot.druid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.list();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insert(@ModelAttribute User user) {
        userService.insert(user.getName(), user.getAge());
        return "success";
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public User findById(Integer id) {
        User user = userService.findById(id);
        return user;
    }

}