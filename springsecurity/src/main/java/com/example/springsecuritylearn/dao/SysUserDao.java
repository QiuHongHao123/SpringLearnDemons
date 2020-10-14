package com.example.springsecuritylearn.dao;


import com.example.springsecuritylearn.entity.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserDao {
    public SysUser getUserById(int id);

    public SysUser getUserByName(String name);

}
