package com.example.UserManagementSpringBoot.model;

public class User {
    private int id;
    private String userName;
    private String city;
    private boolean deleted;

    public User(int id, String userName, String city) {
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

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
