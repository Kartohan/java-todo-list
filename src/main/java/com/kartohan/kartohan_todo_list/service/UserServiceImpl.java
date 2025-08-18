package com.kartohan.kartohan_todo_list.service;

import com.kartohan.kartohan_todo_list.repository.UserRepository;
import com.kartohan.kartohan_todo_list.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl (UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDto registerUser(UserRegistrationDto registrationDto) {
        if (userRepository.findByUsername(registrationDto.getUsername()).isPresent()) {
            throw new RuntimeException("Username is already taken!");
        }
        User newUser = new User();
        UserResponseDto userResponse = new UserResponseDto();
        newUser.setUsername(registrationDto.getUsername());
        String hashedPassword = passwordEncoder.encode(registrationDto.getPassword());
        newUser.setPassword(hashedPassword);
        userRepository.save(newUser);
        userResponse.setId(newUser.getId());
        userResponse.setUsername(newUser.getUsername());
        return userResponse;
    }
}
