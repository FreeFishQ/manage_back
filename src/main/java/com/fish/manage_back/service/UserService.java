package com.fish.manage_back.service;

import com.fish.manage_back.entity.User;
import com.fish.manage_back.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int save(User user){
        if(user.getId()==null){//user没有id表示为新增
            return userMapper.insert(user);
        }else {//否则为更新
            return userMapper.update(user);
        }
    }
}
