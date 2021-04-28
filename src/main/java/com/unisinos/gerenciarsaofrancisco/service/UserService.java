package com.unisinos.gerenciarsaofrancisco.service;

import com.unisinos.gerenciarsaofrancisco.models.User;

public interface UserService {
    void saveOrUpdate (User user);
    User findByEmail(String email);
    User findById(int id);
}
