package com.geekymv.dubbo.provider;

import com.geekymv.dubbo.DemoService;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "${demo.service.version}", timeout = 3000,
        methods = {@Method(name = "sayHello",retries = 2)})
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
