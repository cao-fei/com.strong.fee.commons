package com.strong.fee.cloudconsumer.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDemoB {
    //    @Pointcut("execution(* com.strong.fee.cloudconsumer..*.*A(..))")
//    public void pointCut(){
//
//    }
    @Pointcut("@annotation(com.strong.fee.cloudconsumer.aop.Log)")
    public void pointCut2() {

    }

//    @Before("pointCut()")
//    public void logBefore() {
//        System.out.println("B记录日志 Before1...");
//    }

    @Before("pointCut2()")
    public void logBefore1() {
        System.out.println("B记录日志 Before2...");
    }

    //    @After("pointCut()")
//    public void log() {
//        System.out.println("B记录日志 1...");
//    }
    @After("pointCut2()")
    public void log1() {
        System.out.println("B记录日志 2...");
    }
}