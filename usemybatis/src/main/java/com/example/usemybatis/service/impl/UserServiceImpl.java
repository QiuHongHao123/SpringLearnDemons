package com.example.usemybatis.service.impl;

import com.example.usemybatis.entity.User;
import com.example.usemybatis.mapper.UserDao;
import com.example.usemybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public User GetUser(int id) {

        return userDao.getUser(id);
    }
}
