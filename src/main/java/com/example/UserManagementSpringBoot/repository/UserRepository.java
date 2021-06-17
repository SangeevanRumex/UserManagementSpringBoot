package com.example.UserManagementSpringBoot.repository;

import com.example.UserManagementSpringBoot.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getUsers();
    User getUserById(int id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
