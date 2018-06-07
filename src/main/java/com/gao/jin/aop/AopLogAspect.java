package com.gao.jin.aop;

import com.gao.jin.annotation.AopLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class AopLogAspect {

    @Pointcut("@annotation(com.gao.jin.annotation.AopLog)")
    public void pointCut(){

    }
    @After("pointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Object[] objects = joinPoint.getArgs();
        AopLog aopLog = method.getAnnotation(AopLog.class);
        String name = aopLog.userName();
        System.out.println(name);
    }

//    @Around("pointCut()")
////    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
////        long start = System.currentTimeMillis();
////        System.out.println(start);
////        joinPoint.proceed(new String[]{"gaojinsuo"});
////        System.out.println(System.currentTimeMillis()-start);
////
////    }
}
