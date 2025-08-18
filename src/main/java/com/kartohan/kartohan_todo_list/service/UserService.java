package com.kartohan.kartohan_todo_list.service;

import com.kartohan.kartohan_todo_list.user.model.User;

public interface UserService {
    User registerUser(UserRegistrationDto registrationDto);
}
