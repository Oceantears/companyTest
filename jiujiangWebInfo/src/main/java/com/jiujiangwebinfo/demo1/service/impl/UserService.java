package com.jiujiangwebinfo.demo1.service.impl;

import com.jiujiangwebinfo.demo1.entity.User;
import com.jiujiangwebinfo.demo1.mapper.UserMapper;
import com.jiujiangwebinfo.demo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        System.out.println("==========插入user============" + user);
        userMapper.insert(user);

    }
}
