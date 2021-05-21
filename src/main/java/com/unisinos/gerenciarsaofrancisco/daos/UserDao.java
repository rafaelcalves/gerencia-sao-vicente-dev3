package com.unisinos.gerenciarsaofrancisco.daos;

import com.unisinos.gerenciarsaofrancisco.models.User;

public interface UserDao {
    void saveOrUpdate (User user);
    User findByEmail(String email);
    User findById(int id);
}

