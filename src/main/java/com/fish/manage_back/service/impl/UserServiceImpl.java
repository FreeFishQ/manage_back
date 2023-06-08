package com.fish.manage_back.service.impl;

import com.fish.manage_back.entity.User;
import com.fish.manage_back.mapper.UserMapper;
import com.fish.manage_back.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fish
 * @since 2023-06-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
