package com.example.springsecuritylearn.service.impl;

import com.example.springsecuritylearn.dao.SysUserRoleDao;
import com.example.springsecuritylearn.entity.SysUserRole;
import com.example.springsecuritylearn.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Autowired
    SysUserRoleDao sysUserRoleDao;

    @Override
    public List<SysUserRole> listByUserId(int userId) {
        return sysUserRoleDao.listByUserId(userId);
    }
}
