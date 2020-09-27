package com.example.springsecuritylearn.dao;

import com.example.springsecuritylearn.entity.SysRole;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleDao {
    public SysRole getRoleById(int id);
}
