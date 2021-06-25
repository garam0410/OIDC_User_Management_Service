package com.oidc.user.dto;

import org.apache.catalina.User;

public class UserDto {
    private String uname;
    private String userId;
    private String userPw;
    private String usex;
    private String userEmail;
    private String unumber;

    public UserDto(String uname, String userId, String userPw, String usex, String userEmail, String unumber) {
        this.uname = uname;
        this.userId = userId;
        this.userPw = userPw;
        this.usex = usex;
        this.userEmail = userEmail;
        this.unumber = unumber;
    }

    public UserDto(){}

    public void setUname(String uname){
        this.uname = uname;
    }

    public String getUname(){
        return uname;
    }

    public void setUserid(String userId) {
        this.userId = userId;
    }

    public String getUserid() {
        return userId;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUsex() {
        return usex;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUnumber(String unumber) {
        this.unumber = unumber;
    }

    public String getUnumber() {
        return unumber;
    }
}
