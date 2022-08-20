package com.base.userprovide.forprivade;

import com.base.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public String info() {
        return "张三";
    }
}
