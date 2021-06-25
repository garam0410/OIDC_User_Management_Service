package com.oidc.user.controller;

import com.oidc.user.dao.UserMapper;
import com.oidc.user.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ComponentScan(basePackages={"com.oidc.user.dao"})

@RestController
public class MainController {

    public String result = "";

    @Autowired
    private UserMapper userMapper;

    @GetMapping(path = "/test")
    public String test(){
        result = "user";
        System.out.println(result);
        return result;
    }

    // 중복아이디 확인
    @GetMapping(path = "/checkid")
    public String checkId(@RequestParam String userId){
        try{
            result = userMapper.checkId(userId);
            System.out.println(result);
            if(result == null){
                // 아이디 존재하지 않음
                result = "noExist";
            }
            else{
                // 아이디가 존재함
                result = "Exist";
            }
        }catch(Exception e){
            e.printStackTrace();
            result = "Error";
        }
        System.out.println("중복 : " + result);
        return result;
    }

    // 로그인 처리
    @GetMapping(path = "login")
    public String login(@RequestParam String userId, String userPw){

        UserDto userDto = new UserDto();
        userDto.setUserid(userId);
        userDto.setUserPw(userPw);

        try{
            result = userMapper.login(userDto);

            // 값이 비어있음
            if(result == null){
                result = "Empty";
            }

            // 로그인 성공
            else{
                result = "Success";
            }

        }catch(Exception e){
            e.printStackTrace();
            result = "Error";
        }
        System.out.println("login : " + result);
        return result;
    }
    // 회원가입 처리
    @GetMapping(path = "/register")
    public String register(@RequestParam String uname, String userId, String userPw, String usex, String userEmail, String unumber){

        UserDto userDto = new UserDto(uname, userId, userPw, usex, userEmail, unumber);

        try{

            result = userMapper.checkId(userId);

            // 회원가입 성공
            if(result == null){
                userMapper.register(userDto);
                result = "Success";
            }

            //아이디 중복으로 회원가입 실패
            else{
                result = "Exist";
            }

        }catch(Exception e){
            e.printStackTrace();
            result = "Fail";
        }
        System.out.println("register : " + result);
        return result;
    }

    // ID,PW 찾아서 결과 반환
    @GetMapping(path="/findidpw")
    public List<UserDto> findIdPw(@RequestParam String uname, String userEmail, String unumber){

        List<UserDto> list = null;

        UserDto userDto = new UserDto();
        userDto.setUname(uname);
        userDto.setUserEmail(userEmail);
        userDto.setUnumber(unumber);

        try{
            list = userMapper.findIdPw(userDto);

            // 회원정보 존재함
            if(list.size() != 0){
                result = "Exist";
            }

            // 회원정보 존재하지 않음
            else{
                result = "noExist";
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("find : " + result);
        return list;
    }
}
