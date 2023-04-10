package com.layer.top;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("top")
public class TopController {
    @Autowired
    AppFeignClient feignClient;
    @GetMapping
    public String test(){
        String abc = feignClient.test();
        return "I am top";
    }
}
