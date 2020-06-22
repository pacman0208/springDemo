package com.lee.aop;

/**
 * @Auther: Lee
 * @Date: 6/20/2020 11:09 AM
 * @Software: IntelliJ IDEA
 * @Description:
 */
public class Calculator {

    public int divide(int a,int b){
        System.out.println("Calculator->divide() method call..");
        return a/b;
    }
}
