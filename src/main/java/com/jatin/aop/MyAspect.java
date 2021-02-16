package com.jatin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Around(value = "@annotation(LogExecutionTime)")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime));
    }
}
