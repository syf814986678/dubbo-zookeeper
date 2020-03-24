package com.shiyifan.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
//服务注册和发现
@Service
@Component//这里使用了Dubbo后尽量不要使用service
//项目启用就自动注册到注册中心

public class TicketServiceImpl implements TicketService {
    @Override
    public String gettickets() {
        return "施一帆";
    }
}
