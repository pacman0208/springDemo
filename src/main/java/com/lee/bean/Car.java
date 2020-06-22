package com.lee.bean;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 10:29 AM
 * @Software: IntelliJ IDEA
 * @Description:
 */
public class Car {
    public Car() {
        System.out.println("car created..");
    }

    public void init(){
        System.out.println("car init...");
    }

    public void destroy(){
        System.out.println("car destry...");
    }
}
