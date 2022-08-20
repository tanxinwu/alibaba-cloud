package com.base.userprovide.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {


    @PostMapping("info")
    public  String info(){
        return "用户信息：xxx";
    }
}
