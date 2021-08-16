package com.oidc.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String uname;
    private String userId;
    private String userPw;
    private String uAge;
    private String usex;
    private String userEmail;
    private String unumber;

    public UserDto(String uname, String userId, String userPw, String uAge, String usex, String userEmail, String unumber) {
        this.uname = uname;
        this.userId = userId;
        this.userPw = userPw;
        this.uAge = uAge;
        this.usex = usex;
        this.userEmail = userEmail;
        this.unumber = unumber;
    }

    public UserDto(){}
}
