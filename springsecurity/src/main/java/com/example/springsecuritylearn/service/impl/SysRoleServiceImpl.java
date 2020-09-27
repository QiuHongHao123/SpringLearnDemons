package com.example.springsecuritylearn.service.impl;

import com.example.springsecuritylearn.dao.SysRoleDao;
import com.example.springsecuritylearn.entity.SysRole;
import com.example.springsecuritylearn.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    SysRoleDao sysRoleDao;
    @Override
    public SysRole getRoleById(int id) {
        return sysRoleDao.getRoleById(id);
    }
}
