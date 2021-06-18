package com.example.UserManagementSpringBoot.service;

import com.example.UserManagementSpringBoot.model.User;
import com.example.UserManagementSpringBoot.model.dto.UserDto;
import com.example.UserManagementSpringBoot.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<UserDto> getUsers() {
        List<User> users = userRepository.getUsers();
        return users.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @Override
    public UserDto getUserById(int id) {
        return convertToDto(userRepository.getUserById(id));
    }

    @Override
    public boolean addUser(UserDto userDto) {
        userRepository.addUser(convertFromDto(userDto));
        return true;
    }

    @Override
    public boolean updateUser(UserDto userDto) {
        userRepository.updateUser(convertFromDto(userDto));
        return true;
    }

    @Override
    public boolean deleteUser(int id) {
        userRepository.deleteUser(id);
        return true;
    }

    public UserDto convertToDto(User user) {
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }

    public User convertFromDto(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return user;
    }
}
