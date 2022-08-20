package com.base.combination.controller;

import com.base.service.TradeService;
import com.base.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base/")
public class BaseController {
    @DubboReference(cluster = "failfast")
    private TradeService tradeService;
    @DubboReference(cluster = "failfast")
    private UserService userService;
    @PostMapping("info")
    public String info(){
        return tradeService.info();
    }
}
