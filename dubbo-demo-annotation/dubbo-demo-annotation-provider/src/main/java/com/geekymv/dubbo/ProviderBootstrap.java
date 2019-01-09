package com.geekymv.dubbo;

import com.geekymv.dubbo.provider.ProviderConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class ProviderBootstrap {

    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册配置bean
        context.register(ProviderConfiguration.class);
        // 启动上下文
        context.refresh();

        DemoService demoService = context.getBean(DemoService.class);
        String result = demoService.sayHello("World");
        System.out.println(result);

        System.in.read();

    }
}
