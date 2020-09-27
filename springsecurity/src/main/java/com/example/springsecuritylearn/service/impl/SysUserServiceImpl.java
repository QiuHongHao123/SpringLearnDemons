package com.example.springsecuritylearn.service.impl;

import com.example.springsecuritylearn.dao.SysUserDao;
import com.example.springsecuritylearn.entity.SysUser;
import com.example.springsecuritylearn.entity.SysUserRole;
import com.example.springsecuritylearn.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserDao sysUserDao;

    @Override
    public SysUser getUserById(int id) {
        return sysUserDao.getUserById(id);
    }

    @Override
    public SysUser getUserByName(String name) {
        return sysUserDao.getUserByName(name);
    }
}
