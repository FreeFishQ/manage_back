package com.fish.manage_back.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fish.manage_back.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.lang.UsesSunHttpServer;

import java.util.List;
//@Mapper
public interface UserMapper extends BaseMapper<User> {
//    @Select("select * from user")
//    public List<User> selectAllUser();
//    @Insert("insert into user (username,password,nickname,email,phone,address) values (#{username},#{password},#{nickname},#{email},#{phone},#{address})")
//    int insert(User user1);
//
//    int update(User user1);
//    @Delete("DELETE from user where id=#{id}")
//    Integer deleteById(@Param("id") Integer id);
//    @Select("select * from user where username like #{username} limit #{pageNum},#{pageSize}")
//    List<User> selectPage(Integer pageNum, Integer pageSize,String username);
//@Select("select count(*) from /**/user where username like #{username}")
//    Integer selectTotal(String username);
}
