package com.oidc.user.controller;

import com.oidc.user.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages={"com.oidc.user.dao"})

@RestController
public class MainController {

    public String result = "";

    @Autowired
    private UserMapper userMapper;

    @GetMapping(path = "/test")
    public String test(){
        result = "user";
        return result;
    }

    // 중복회원 확인

    // 로그인 처리
    @GetMapping(path = "login")
    public String login(@RequestParam String userId, String userPw){
        try{

            result = userMapper.login(userId, userPw);
            if(result.equals("")){
                result = "Empty";
            }
            else{
                result = "Success";
            }

        }catch(Exception e){
            e.printStackTrace();
            result = "Error";
        }
        return result;
    }
    // 회원가입 처리

    // ID,PW 찾아서 결과 반환
}
