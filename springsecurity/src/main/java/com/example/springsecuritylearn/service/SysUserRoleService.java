package com.example.springsecuritylearn.service;

import com.example.springsecuritylearn.entity.SysUser;
import com.example.springsecuritylearn.entity.SysUserRole;

import java.util.List;

public interface SysUserRoleService {
    public List<SysUserRole> listByUserId(int userId);
}
