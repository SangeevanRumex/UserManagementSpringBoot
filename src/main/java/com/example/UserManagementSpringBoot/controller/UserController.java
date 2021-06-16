package com.example.UserManagementSpringBoot.controller;

import com.example.UserManagementSpringBoot.dao.UserRepository;
import com.example.UserManagementSpringBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        return userRepository.addUser(user);
    }

    @PutMapping("/user")
    public String updateUser(@RequestBody User user){
        return userRepository.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") int id){
        return userRepository.deleteUser(id);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.getUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userRepository.getUserById(id);
    }
}
