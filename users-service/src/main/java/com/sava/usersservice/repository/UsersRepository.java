package com.sava.usersservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sava.usersservice.entity.User;

@Service
public class UsersRepository {
    private List<User> users = new ArrayList<>();

    public UsersRepository() {
        users.add(new User("Y13_1ZLlHOomj7aBRMN_k", "Jordan"));
        users.add(new User("lXYbauHEyp2a8fl2zBKZ9", "Dimitar"));
        users.add(new User("WuHKTCL08V7N4cH-LG4D3", "Jivko"));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(String id) {
        return users.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
