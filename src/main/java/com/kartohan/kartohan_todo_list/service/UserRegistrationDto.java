package com.kartohan.kartohan_todo_list.service;

import com.kartohan.kartohan_todo_list.user.model.User;

public class UserRegistrationDto {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
