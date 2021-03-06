package com.example.UserManagementSpringBoot.model.dto;

public class UserDto {
    private int id;
    private String userName;
    private String city;

    public UserDto() {
    }

    public UserDto(int id, String userName, String city) {
        this.id = id;
        this.userName = userName;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
