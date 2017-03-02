package com.companies.pojos;

public class Users implements java.io.Serializable {

    private Integer userId;
    private String userName;
    private String userUserName;
    private String userPw;

    public Users() {
    }

    public Users(String userName, String userUserName, String userPw) {
        this.userName = userName;
        this.userUserName = userUserName;
        this.userPw = userPw;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserUserName() {
        return this.userUserName;
    }

    public void setUserUserName(String userUserName) {
        this.userUserName = userUserName;
    }

    public String getUserPw() {
        return this.userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

}
