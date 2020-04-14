package com.item.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ITOKEN-ACCOUNT-PROVIDER")
public interface SystemFeign {

    @GetMapping("system/getport")
    public String getPort();
}
