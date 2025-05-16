package com.example.demo.services;

import com.example.demo.dtos.UserDto;
import com.example.demo.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(UserDto userDto);
    List<User> getUsers();
}
