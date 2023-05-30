package com.fish.manage_back.controller;

import com.fish.manage_back.entity.User;
import com.fish.manage_back.mapper.UserMapper;
import com.fish.manage_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
//    新增和修改
    @PostMapping
    public Integer save(@RequestBody User user){
//       return userMapper.insert(user);
        return userService.save(user);
    }
//    查询所有数据
    @GetMapping
    public List<User> index(){
        List<User> list;
        list =userMapper.selectAllUser();
        return list;
    }

    @DeleteMapping("/{id}")
    private Integer delete(@PathVariable Integer id){
        return userMapper.deleteById(id);
    }
}
