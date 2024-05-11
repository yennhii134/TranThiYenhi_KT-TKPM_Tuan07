package com.example.userservice.controllers;

import com.example.userservice.models.User;
import com.example.userservice.servives.UserServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServive userServive;

    @GetMapping("/get-all")
    public List<User> getAllUser() {
        return userServive.getAllUser();
    }
}
