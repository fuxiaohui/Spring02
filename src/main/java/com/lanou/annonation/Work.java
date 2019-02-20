package com.lanou.annonation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class Work {

    @Pointcut("bean(boy) || bean(girl)")
    public void abc() {}

    @Before("abc()")
    public void printTime1() {
        System.out.println(System.currentTimeMillis());
    }

    @After("abc()")
    public void printTime2() {
        System.out.println(System.currentTimeMillis());
    }

    @Around("abc()")
    public void printTime3(ProceedingJoinPoint joinPoint) {
        System.out.println(new Date());
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println(new Date());
    }
}
