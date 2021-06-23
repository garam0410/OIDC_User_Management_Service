package com.oidc.user.dao;

public interface UserMapper {
    String login(String userId, String userPw);
}
