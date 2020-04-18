package com.item.feign;


import com.item.bean.User;
import com.item.property.General;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = General.SERVICE_NAME)
public interface UserFeign {

    @PostMapping(value = "get_all_user")
    public List<User> get_all_user();
}
