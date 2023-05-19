package com.fish.manage_back.mapper;

import com.fish.manage_back.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> selectAllUser();
}
