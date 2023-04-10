package com.layer.top;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "bottom-service")
public interface AppFeignClient {
    @GetMapping
    public String test();

}
