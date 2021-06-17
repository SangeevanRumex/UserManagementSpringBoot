package com.example.UserManagementSpringBoot.service;

import com.example.UserManagementSpringBoot.model.User;
import com.example.UserManagementSpringBoot.repository.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

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
    public boolean addUser(User user) {
        userRepository.addUser(user);
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        userRepository.updateUser(user);
        return true;
    }

    @Override
    public boolean deleteUser(int id) {
        userRepository.deleteUser(id);
        return true;
    }
}
