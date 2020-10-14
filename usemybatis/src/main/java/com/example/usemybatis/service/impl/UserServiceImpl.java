package com.example.usemybatis.service.impl;

import com.example.usemybatis.entity.User;
import com.example.usemybatis.mapper.UserMapper;
import com.example.usemybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User GetUser(int id) {

        return userMapper.getUser(id);
    }
}
