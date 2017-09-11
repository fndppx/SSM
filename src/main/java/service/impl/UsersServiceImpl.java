package service.impl;

import dao.UserDao;
import entity.User;

import javax.annotation.Resource;

public class UsersServiceImpl {
    @Resource
    private UserDao userDao = null;


    public User addUser(String username, String password){
        return userDao.addUser(username,password);
    }
}

