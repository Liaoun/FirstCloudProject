package com.item.feign;

import com.item.property.General;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = General.SERVICE_NAME)
public interface SystemFeign {

    @GetMapping("system/getport")
    public String getPort();
}
