package com.example.usemybatis.controller;

import com.example.usemybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.GetUser(id).toString();
    }
}
