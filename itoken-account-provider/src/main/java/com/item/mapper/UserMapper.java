package com.item.mapper;


import com.item.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

        @Select("select * from user")
        List<User> get_all_user();
}
