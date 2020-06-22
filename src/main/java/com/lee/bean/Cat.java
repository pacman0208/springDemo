package com.lee.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 10:55 AM
 * @Software: IntelliJ IDEA
 * @Description:
 */
@Component
public class Cat {

    public Cat() {
        System.out.println("Cat created..");
    }

    @PostConstruct
    public void init(){
        System.out.println("Cat init..");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Cat destroy..");
    }
}
