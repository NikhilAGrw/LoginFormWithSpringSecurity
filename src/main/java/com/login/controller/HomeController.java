package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/signin")
    public String login() {
        System.out.println("login page");
        return "login";
    }

    @RequestMapping("/signup")
    public String signup() {
        System.out.println("sign up page");
        return "signup";
    }

    @RequestMapping("/user/hello")
    public String hello() {
        System.out.println("hello page");
        return "hello";
    }

}
