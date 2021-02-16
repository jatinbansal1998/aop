package com.jatin.aop;

import org.springframework.stereotype.Component;

@Component
public class MyClass implements IMyClass{

    @LogExecutionTime
    public void someMethod() throws InterruptedException {
        new RuntimeException().printStackTrace();
        System.out.println("some method");
        Thread.sleep(1000L);
    }
}
