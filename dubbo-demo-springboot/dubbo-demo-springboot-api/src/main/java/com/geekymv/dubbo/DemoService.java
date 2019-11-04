package com.geekymv.dubbo;

import java.util.concurrent.CompletableFuture;

public interface DemoService {

    String sayHello(String name);

    /**
     * 异步化
     * @param name
     * @return
     */
    default CompletableFuture sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }
}
