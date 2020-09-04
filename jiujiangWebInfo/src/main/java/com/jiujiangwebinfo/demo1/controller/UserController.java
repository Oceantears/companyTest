package com.jiujiangwebinfo.demo1.controller;

import com.jiujiangwebinfo.demo1.entity.User;
import com.jiujiangwebinfo.demo1.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("insert")
    public void insert(User user){

        user.setId(2);
        user.setName("aaaaa");

        userService.insert(user);
    }

}
