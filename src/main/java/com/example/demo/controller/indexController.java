package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class indexController {
    @RequestMapping("/test")
    public  String test(Model model) {
            model.addAttribute("msg","<h1>hello,world!</h1>");
            model.addAttribute("users", Arrays.asList("张三","李四","王五"));
            return "test";
    }



}
