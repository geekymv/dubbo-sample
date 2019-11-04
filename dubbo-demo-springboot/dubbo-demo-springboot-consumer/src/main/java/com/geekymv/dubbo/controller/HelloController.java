package com.geekymv.dubbo.controller;

import com.geekymv.dubbo.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@Slf4j
@RestController
public class HelloController {

    @Reference(version = "1.0")
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello() {
        return demoService.sayHello("zhangsan");
    }

    @GetMapping("/sayHelloAsync")
    public String sayHelloAsync() {
        CompletableFuture<String> future = demoService.sayHelloAsync("lisi");
        future.whenComplete((retValue, exception) -> {
            if (exception == null) {
                log.info("retValue = " + retValue);
            } else {
                exception.printStackTrace();
            }
            log.info("when complete");
        });

        log.info("return success");

        return "success";
    }

}
