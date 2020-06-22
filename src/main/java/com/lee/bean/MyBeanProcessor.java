package com.lee.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 11:26 AM
 * @Software: IntelliJ IDEA
 * @Description: 实现对于所有容器中的bean在初始之前和初始之后进行操作
 */
@Component
public class MyBeanProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInitialization--"+beanName+"---"+bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization--"+beanName+"---"+bean);
        return bean;
    }
}
