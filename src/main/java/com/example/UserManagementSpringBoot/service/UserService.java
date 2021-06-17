package com.example.UserManagementSpringBoot.service;

import com.example.UserManagementSpringBoot.model.User;
import com.example.UserManagementSpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getUsers();
    User getUserById(int id);
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(int id);
}
