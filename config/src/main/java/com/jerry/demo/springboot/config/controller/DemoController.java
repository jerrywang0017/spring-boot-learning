package com.jerry.demo.springboot.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${test.name}")
    private String name;

    @Value("${test.active}")
    private String active;

    @Value("${test.randomint}")
    private String randomint;

    @RequestMapping()
    public String demo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name:").append(name).append("\n");
        stringBuilder.append("active:").append(active).append("\n");
        stringBuilder.append("randomint:").append(randomint).append("\n");
        return stringBuilder.toString();
    }

}
