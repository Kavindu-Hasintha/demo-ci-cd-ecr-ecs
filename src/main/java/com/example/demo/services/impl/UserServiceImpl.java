package com.example.demo.services.impl;

import com.example.demo.dtos.UserDto;
import com.example.demo.entities.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setAge(userDto.getAge());

        return userRepo.save(user);
    }

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users = userRepo.findAll();
        return users;
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id).get();
    }
}
