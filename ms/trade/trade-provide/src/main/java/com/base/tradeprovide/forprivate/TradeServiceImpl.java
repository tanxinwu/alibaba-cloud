package com.base.tradeprovide.forprivate;

import com.base.service.TradeService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.ArrayList;
import java.util.List;

@DubboService
public class TradeServiceImpl implements TradeService {
    @Override
    public String info() {
        return "张三购买了一台电脑";
    }


}
