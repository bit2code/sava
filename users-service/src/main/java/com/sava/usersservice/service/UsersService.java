package com.sava.usersservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sava.usersservice.entity.User;
import com.sava.usersservice.repository.UsersRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    public List<User> getAll() {
        return this.usersRepository.findAll();
    }

    public User getUserById(String userId) {
        return this.usersRepository.findById(userId);
    }
}
