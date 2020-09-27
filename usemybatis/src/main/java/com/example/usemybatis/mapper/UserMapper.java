package com.example.usemybatis.mapper;

import com.example.usemybatis.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getUser(int id);
}
