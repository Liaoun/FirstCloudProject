package com.item.controller;


import com.item.bean.User;
import com.item.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServer server;
    @PostMapping("get_all_user")
    public List<User> get_all_user(){
        return server.get_all_user();
    }
}
