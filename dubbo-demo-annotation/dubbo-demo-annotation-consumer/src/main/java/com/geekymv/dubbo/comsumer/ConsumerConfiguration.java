package com.geekymv.dubbo.comsumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@DubboComponentScan("com.geekymv.dubbo.comsumer")
public class ConsumerConfiguration {

    /**
     * 应用配置
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-demo-annotation-consumer");

        return applicationConfig;
    }

    /**
     * 注册中心配置
     * @return
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");

        return registryConfig;
    }

    /**
     * 注册 DemoServiceConsumer 成为Spring bean，@DubboComponentScan 将处理其中 @Reference 字段
     * @return
     */
    @Bean
    public DemoServiceConsumer demoServiceConsumer() {
        return new DemoServiceConsumer();
    }

}
