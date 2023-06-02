package com.fish.manage_back.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fish.manage_back.entity.User;
import com.fish.manage_back.mapper.UserMapper;
import com.fish.manage_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private UserMapper userMapper;
    @Autowired
    private UserService userService;
//    新增和修改
    @PostMapping
    public boolean save(@RequestBody User user){
//       return userMapper.insert(user);

        return userService.saveUser(user);
    }
//    查询所有数据
    @GetMapping
    public List<User> findAll(){
//        List<User> list;
//        list =userMapper.selectAllUser();
//        return list;
        return userService.list();
    }

    @DeleteMapping("/{id}")
    private boolean delete(@PathVariable Integer id){
//        return userMapper.deleteById(id);
        return userService.removeById(id);
    }

    @PostMapping("/del/batch")
    private boolean deleteBatch(@RequestBody List<Integer> ids){
//        return userMapper.deleteById(id);
        return userService.removeBatchByIds(ids);
    }

//    @GetMapping("/page")//分页查询
//    public Map<String,Object> findByPage(@RequestParam Integer pageNum,@RequestParam Integer pageSize,
//                                         @RequestParam String username){
//        pageNum=(pageNum-1)*pageSize;
//        username="%"+username+"%";
//        List<User> list = userMapper.selectPage(pageNum, pageSize,username);
//        Integer total = userMapper.selectTotal(username);
//        Map<String, Object> res=new HashMap<>();
//        res.put("data",list);
//        res.put("total",total);
//        return res;
//    }
//muybatisplus版
    @GetMapping("/page")//分页查询
    public IPage<User> findByPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize,
                                  @RequestParam String username,
                                  @RequestParam(defaultValue = "") String email,
                                  @RequestParam(defaultValue = "") String address){
        IPage<User> page=new Page<>(pageNum,pageSize);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        if (!"".equals(username)){
            userQueryWrapper.like("username",username);
        }
        if (!"".equals(email)){
            userQueryWrapper.like("email",email);
        }
        if (!"".equals(address)){
            userQueryWrapper.like("address",address);
        }
        userQueryWrapper.orderByDesc("id");

        return userService.page(page,userQueryWrapper);
    }
}
