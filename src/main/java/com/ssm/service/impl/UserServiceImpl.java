package com.ssm.service.impl;

import com.ssm.entity.Users;
import com.ssm.dao.UserDao;

import javax.annotation.Resource;

public class UserServiceImpl {
    @Resource
    private UserDao userDao = null;


    public Users addUser(String username, String password){
        return userDao.addUser(username,password);
    }
}
