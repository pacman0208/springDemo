package com.lee.config;

import com.lee.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 10:31 AM
 * @Software: IntelliJ IDEA
 * @Description: BEAN生命周期配置文件
 */
@ComponentScan("com.lee.bean")
@Configuration
public class BeanLifeCycleConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }
}
