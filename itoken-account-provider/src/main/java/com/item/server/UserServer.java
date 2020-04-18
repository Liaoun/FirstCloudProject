package com.item.server;

import com.item.bean.User;
import com.item.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServer {

    @Autowired
    UserMapper mapper;

    public List<User> get_all_user(){
        return mapper.get_all_user();
    }
}
