package com.sharrusr.preProject311.service;

import com.sharrusr.preProject311.model.User;

import java.util.List;

public interface UserService {
    public List<User> listUsers();

    public void saveUser(User user);

    public void deleteUser(int id);

    public User getUserById(int id);

    public void updateUser(User user);
}
