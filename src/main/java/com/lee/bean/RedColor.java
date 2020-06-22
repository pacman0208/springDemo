package com.lee.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.util.StringValueResolver;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 9:37 AM
 * @Software: IntelliJ IDEA
 * @Description:
 */
public class RedColor implements ApplicationContextAware, EnvironmentAware, EmbeddedValueResolverAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String s = "你好 #{person.name} ,你今年已经#{12+23}岁了";
        String s1 = resolver.resolveStringValue(s);
        System.out.println(s1);
    }

    @Override
    public void setEnvironment(Environment environment) {
        String property = environment.getProperty("os.name");
        System.out.println("欢迎使用"+property);
    }
}
