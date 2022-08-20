package com.base.tradeprovide.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/trade/")
public class TradeController {

    private List<String> list = new ArrayList<>();
    @PostMapping("info")
    public String info(){

        while (true) {
            list.add("jdlkfjkl");
        }

    }
}
