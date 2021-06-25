package com.oidc.user.dao;


import com.oidc.user.dto.UserDto;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 로그인
    String login(UserDto userDto);
    // 중복검사
    String checkId(String userId);
    // 회원가입
    void register(UserDto userDto);
    // ID,PW 찾기
    List<UserDto> findIdPw(UserDto userDto);
}
