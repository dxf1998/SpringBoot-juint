package com.zuoyang.springbootjuint.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuoYangController {
    @GetMapping("/hello")
    public String helloZuoYang(String hi){
        return hi+" 左羊";
    }

}
