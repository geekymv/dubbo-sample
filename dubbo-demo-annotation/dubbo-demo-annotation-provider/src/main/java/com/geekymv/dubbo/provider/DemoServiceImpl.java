package com.geekymv.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.geekymv.dubbo.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
