package com.jerry.demo.springboot.exception.controller;

import com.jerry.demo.springboot.exception.exception.MyException;
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

    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

}
