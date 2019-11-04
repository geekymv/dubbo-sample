package com.geekymv.dubbo.controller;

import com.geekymv.dubbo.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(version = "1.0")
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello() {
        return demoService.sayHello("zhangsan");
    }

}
