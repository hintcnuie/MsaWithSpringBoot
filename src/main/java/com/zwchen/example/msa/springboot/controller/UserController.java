package com.zwchen.example.msa.springboot.controller;

import com.zwchen.example.msa.springboot.po.User;
import com.zwchen.example.msa.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }
    @RequestMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id){
        this.userService.deleteUser(id);
    }
}
