package com.example.userservice.servives;

import com.example.userservice.models.User;
import com.example.userservice.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServive {
    private final UserRepository userRepository;

    public UserServive(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
