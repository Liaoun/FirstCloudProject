package com.item.controller;

import com.item.bean.User;
import com.item.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("user")
@Controller
public class UserController {

    @Autowired
    UserFeign feign;

    @RequestMapping("get_all_user")
    @ResponseBody
    public List<User> get_all_user(){
        return feign.get_all_user();
    }
}
