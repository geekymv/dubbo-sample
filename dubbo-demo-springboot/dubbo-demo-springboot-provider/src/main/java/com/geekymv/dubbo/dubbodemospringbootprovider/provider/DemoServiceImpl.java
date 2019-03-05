package com.geekymv.dubbo.dubbodemospringbootprovider.provider;

import com.geekymv.dubbo.DemoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
