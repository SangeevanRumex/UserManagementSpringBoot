package com.example.UserManagementSpringBoot.repository;

import com.example.UserManagementSpringBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final String GET_USERS_QUERY="SELECT * FROM user";
    private static final String INSERT_USER_QUERY="INSERT INTO user(id,userName,city) values(?,?,?)";
    private static final String UPDATE_USER_QUERY="UPDATE user SET userName=?, city=? WHERE id=?";
    private static final String GET_USER_BY_ID_QUERY="SELECT * FROM user WHERE id=? AND deleted!=1";
    private static final String DELETE_USER_QUERY="UPDATE user SET deleted=true WHERE id=?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getUsers() {
        return jdbcTemplate.query(GET_USERS_QUERY,(resultSet, i) -> {
            return new User(resultSet.getInt("id"),resultSet.getString("userName"),resultSet.getString("city"));
        });
    }

    @Override
    public User getUserById(int id) {
        return jdbcTemplate.queryForObject(GET_USER_BY_ID_QUERY,(resultSet, i) -> {
            return new User(resultSet.getInt("id"),resultSet.getString("userName"),resultSet.getString("city"));
        },id);
    }

    @Override
    public void addUser(User user) {
        jdbcTemplate.update(INSERT_USER_QUERY,user.getId(),user.getUserName(),user.getCity());
    }

    @Override
    public void updateUser(User user) {
        jdbcTemplate.update(UPDATE_USER_QUERY,user.getUserName(),user.getCity(),user.getId());
    }

    @Override
    public void deleteUser(int id) {
        jdbcTemplate.update(DELETE_USER_QUERY,id);
    }
}
