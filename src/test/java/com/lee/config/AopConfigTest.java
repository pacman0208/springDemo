package com.lee.config;

import com.lee.aop.Calculator;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: Lee
 * @Date: 6/20/2020 11:15 AM
 * @Software: IntelliJ IDEA
 * @Description:
 */
public class AopConfigTest {

    @Test
    public void aopTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        Calculator cal = context.getBean(Calculator.class);
        cal.divide(8,0);
    }
}
