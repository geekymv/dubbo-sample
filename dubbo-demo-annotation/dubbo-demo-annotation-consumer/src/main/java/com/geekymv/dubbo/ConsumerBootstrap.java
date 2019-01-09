package com.geekymv.dubbo;

import com.geekymv.dubbo.comsumer.ConsumerConfiguration;
import com.geekymv.dubbo.comsumer.DemoServiceConsumer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class ConsumerBootstrap {

    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册配置bean
        context.register(ConsumerConfiguration.class);

        // 启动上下文
        context.refresh();

        DemoServiceConsumer demoService = context.getBean(DemoServiceConsumer.class);
        String result = demoService.doSayHello("World");
        System.out.println(result);

    }
}
