package com.zwchen.example.msa.springboot.service;

import com.zwchen.example.msa.springboot.mapper.UserMapper;
import com.zwchen.example.msa.springboot.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(value = "UserCache",key="'user.getAllUsers'")
    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        userList = this.userMapper.getAllusers();

        return  userList;
    }

    @Override
    @CacheEvict(value = "UserCache",key="'user.getAllUsers'")
    public void deleteUser(Integer id) {
        System.out.println("Delete user of id :" + id);
        this.userMapper.delete(id);
    }
}
