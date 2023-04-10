package com.layer.bottom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bottom")
public class BottomController {
    @GetMapping
    public String test(){
        return "I am bottom";
    }
}
