package com.fish.manage_back.controller;

import com.fish.manage_back.entity.User;
import com.fish.manage_back.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserMapper userMapper;


    @GetMapping("/")
    public List<User> index(){
        List<User> list=new ArrayList<>();
        list =userMapper.selectAllUser();
        return list;
    }
}
