package com.lee.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Auther: Lee
 * @Date: 6/20/2020 11:09 AM
 * @Software: IntelliJ IDEA
 * @Description:
 */
@Component
@Aspect
public class CalAspectLog {
    @Pointcut("execution(public int com.lee.aop.Calculator.*(..))")
    public void cutPoint(){

    }

    @Before("cutPoint()")
    public void before(JoinPoint joinPoint){
        System.out.println("Before method "+joinPoint.getSignature().getName()+" execute");
        Object[] args = joinPoint.getArgs();
        System.out.println("参数是:"+ Arrays.asList(args));
    }

    @After("com.lee.aop.CalAspectLog.cutPoint()")
    public void after(JoinPoint joinPoint){
        System.out.println("After method "+joinPoint.getSignature().getName()+" execute");
    }


    @AfterReturning(value="cutPoint()",returning = "result")
    public void afterReturn(Object result){
        System.out.println("After returning,return :"+result);
    }

    @AfterThrowing(value = "cutPoint()",throwing = "exp")
    public void exception(Exception exp){
        System.out.println("Exception happened..,exp is:"+exp.getMessage());
    }
}
