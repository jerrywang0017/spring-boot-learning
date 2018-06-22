package com.jerry.demo.springboot.actuator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DemoController {

    @RequestMapping("")
    public String index() {
        return "";
    }

    @RequestMapping(value = "post", method = RequestMethod.POST)
    public String post() {
        return "";
    }

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get() {
        return "";
    }

}
