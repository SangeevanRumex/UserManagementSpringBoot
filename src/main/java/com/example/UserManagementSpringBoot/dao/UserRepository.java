package com.example.UserManagementSpringBoot.dao;

import com.example.UserManagementSpringBoot.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getUsers();
    User getUserById(int id);
    String addUser(User user);
    String updateUser(User user);
    String deleteUser(int id);
}
