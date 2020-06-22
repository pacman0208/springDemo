package com.lee.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 10:31 AM
 * @Software: IntelliJ IDEA
 * @Description:
 */
public class BeanLifeCycleTest {
    @Test
    public void lifeCycleTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanLifeCycleConfig.class);
        context.close();
        System.out.println("容器创建结束");
    }
}
