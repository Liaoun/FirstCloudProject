package com.item.controller;

import com.item.feign.SystemFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("system")
public class SystemController {

    @Autowired
    SystemFeign feign;
    @RequestMapping("getport")
    public String getPort(){
        return feign.getPort();
    }

}
