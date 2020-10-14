package com.example.springsecuritylearn.dao;

import com.example.springsecuritylearn.entity.SysUserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserRoleDao {
    public List<SysUserRole> listByUserId(int userId);
}
