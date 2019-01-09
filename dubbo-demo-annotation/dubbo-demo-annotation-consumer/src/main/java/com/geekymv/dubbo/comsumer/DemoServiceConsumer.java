package com.geekymv.dubbo.comsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.geekymv.dubbo.DemoService;

public class DemoServiceConsumer {

    @Reference
    private DemoService demoService;

    public String doSayHello(String name) {
        return demoService.sayHello(name);
    }

}
