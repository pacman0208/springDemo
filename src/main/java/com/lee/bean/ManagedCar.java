package com.lee.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 10:43 AM
 * @Software: IntelliJ IDEA
 * @Description:实现接口从而指定自定义初始化和销毁方法
 */
@Component
public class ManagedCar implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("ManagedCar destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ManagedCar init...");

    }
}
