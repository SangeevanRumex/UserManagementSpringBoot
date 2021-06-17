package com.example.UserManagementSpringBoot.service;

import com.example.UserManagementSpringBoot.model.User;
import com.example.UserManagementSpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public String addUser(User user) {
        userRepository.addUser(user);
        return "User successfully created";
    }

    @Override
    public String updateUser(User user) {
        userRepository.updateUser(user);
        return "User successfully updated";
    }

    @Override
    public String deleteUser(int id) {
        userRepository.deleteUser(id);
        return "User successfully deleted";
    }
}
