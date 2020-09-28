package com.example.springsecuritylearn.security.service;

import com.example.springsecuritylearn.entity.SysRole;
import com.example.springsecuritylearn.entity.SysUser;
import com.example.springsecuritylearn.entity.SysUserRole;
import com.example.springsecuritylearn.service.SysRoleService;
import com.example.springsecuritylearn.service.SysUserRoleService;
import com.example.springsecuritylearn.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysUserRoleService sysUserRoleService;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Collection<GrantedAuthority> authorities = new ArrayList<>();

        SysUser sysUser=sysUserService.getUserByName(userName);
        if(sysUser == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        // 添加权限
        List<SysUserRole> userRoles = sysUserRoleService.listByUserId(sysUser.getId());
        for (SysUserRole userRole : userRoles) {
            SysRole role = sysRoleService.getRoleById(userRole.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        // 返回UserDetails实现类
        return new User(sysUser.getName(), sysUser.getPassword(), authorities);


    }

}
