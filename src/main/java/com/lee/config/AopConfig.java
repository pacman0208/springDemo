package com.lee.config;

import com.lee.aop.CalAspectLog;
import com.lee.aop.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Auther: Lee
 * @Date: 6/20/2020 11:13 AM
 * @Software: IntelliJ IDEA
 * @Description:
 */
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {
    @Bean
    public Calculator calculator(){
        return new Calculator();
    }

    @Bean
    public CalAspectLog calAspectLog(){
        return new CalAspectLog();
    }
}
