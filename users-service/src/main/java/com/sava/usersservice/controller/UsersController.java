package com.sava.usersservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sava.usersservice.entity.User;
import com.sava.usersservice.service.UsersService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UsersController {
    private final UsersService usersService;

    @GetMapping
    public List<User> getUsers() {
        return this.usersService.getAll();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable String userId) {
        return usersService.getUserById(userId);
    }
}
