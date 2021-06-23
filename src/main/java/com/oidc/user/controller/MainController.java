package com.oidc.user.controller;

import com.oidc.user.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages="com.oidc.social.dao")

@RestController
public class MainController {

    public String result = "";

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/test")
    public String test(){
        //userMapper.test();
        return "user";
    }
}
