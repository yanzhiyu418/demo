package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class loginController {
    @RequestMapping("/user/login")
    @ResponseBody
    public String login(
            @RequesParam("username") String username,
            @RequesParam("password") String password,
            Model model
    ){

    }
}
