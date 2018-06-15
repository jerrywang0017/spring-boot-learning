package com.jerry.demo.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class DemoController {

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("host", "Jerry Thymeleaf");
        return "index";
    }

}
