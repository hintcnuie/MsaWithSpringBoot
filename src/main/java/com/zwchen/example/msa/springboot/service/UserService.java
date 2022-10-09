package com.zwchen.example.msa.springboot.service;

import com.zwchen.example.msa.springboot.po.User;

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
