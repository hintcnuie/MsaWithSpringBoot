package com.example.hellospringboot.service;

import com.example.hellospringboot.po.User;

import java.util.List;

/**
 * @author zwchen
 */
public interface UserService {
    /**
     * @return User
     */
    List<User> getAllUsers();

    /**
     * @param id id
     */
    void deleteUser(Integer id);
}
