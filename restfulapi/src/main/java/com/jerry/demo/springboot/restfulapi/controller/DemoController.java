package com.jerry.demo.springboot.restfulapi.controller;

import com.jerry.demo.springboot.restfulapi.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("user")
public class DemoController {

    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<User> getUserList() {
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }

    @RequestMapping(value = "insert", method = RequestMethod.GET)
    public int insert(@ModelAttribute User user) {
        users.put(user.getId(), user);
        return 1;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public User push(@PathVariable(name = "id") Long id) {
        return users.get(id);
    }

}
