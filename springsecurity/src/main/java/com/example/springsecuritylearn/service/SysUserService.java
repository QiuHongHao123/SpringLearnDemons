package com.example.springsecuritylearn.service;

import com.example.springsecuritylearn.entity.SysUser;
import com.example.springsecuritylearn.entity.SysUserRole;

import java.util.List;

public interface SysUserService {
    public SysUser getUserById(int id);

    public SysUser getUserByName(String name);

}
