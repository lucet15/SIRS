package com.example.springboot.user;

public class User {

    private int mobile;
    private String username;
    private String password;

    public User(int mobile, String name, String pass) {
        this.mobile = mobile;
        this.username = name;
        this.password = pass;
    }

    public int getMobile() {
        return this.mobile;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

}

