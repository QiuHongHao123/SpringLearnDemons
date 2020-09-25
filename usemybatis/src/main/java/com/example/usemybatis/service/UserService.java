package com.example.usemybatis.service;

import com.example.usemybatis.entity.User;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserService {
    public User GetUser(int id);
}
