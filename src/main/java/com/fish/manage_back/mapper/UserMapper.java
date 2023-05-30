package com.fish.manage_back.mapper;

import com.fish.manage_back.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> selectAllUser();
    @Insert("insert into user (username,password,nickname,email,phone,address) values (#{username},#{password},#{nickname},#{email},#{phone},#{address})")
    int insert(User user1);

    int update(User user1);
    @Delete("DELETE from user where id=#{id}")
    Integer deleteById(@Param("id") Integer id);
}
