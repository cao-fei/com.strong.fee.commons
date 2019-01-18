//package com.strong.fee.cloudconsumer.aop;
//
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class AspectDemo {
//    @Pointcut("execution(* com.strong.fee.cloudconsumer..*.*A(..))")
//    public void pointCut() {
//
//    }
////
////    @Pointcut("execution(* com.strong.fee.cloudconsumer..*.*B(..))")
////    public void pointCut2() {
////
////    }
//
////    @Pointcut("@annotation(com.strong.fee.cloudconsumer.aop.Log)")
////    public void pointCutLog() {
////
////    }
//
//    @Before("pointCut()")
//    public void logBefore() {
//        System.out.println("记录日志 Before1...");
//    }
//
////    @Before("pointCutLog()")
////    public void logBefore1() {
////        System.out.println("记录日志 Before2...");
////    }
//
//    @After("pointCut()")
//    public void log() {
//        System.out.println("记录日志 1...");
//    }
//
////    @After("pointCutLog()")
////    public void log1() {
////        System.out.println("记录日志 2...");
////    }
//}