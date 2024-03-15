package com.login.controller;

import com.login.binding.LoginUser;
import com.login.model.UserEntity;
import com.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String userRegister(@ModelAttribute UserEntity userEntity){
        String userRegister = userService.userRegister(userEntity);

        if (userRegister != null)
        {
            return "login";
        }
       return "signup";
    }

    @PostMapping("/login")
    public String userLogin(@ModelAttribute LoginUser loginUser){
        String login = userService.loginUserWithEmail(loginUser);
        return "hello";
    }



}
