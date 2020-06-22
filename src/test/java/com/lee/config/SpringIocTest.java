package com.lee.config;

import com.lee.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 8:43 AM
 * @Software: IntelliJ IDEA
 * @Description:
 */
public class SpringIocTest {
    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    private String string;

    @Test
    public void loadBean(){

        Person p = context.getBean("defaultPerson", Person.class);
        System.out.println(p);
    }

    @Test
    public void printComponent(){
        String[] beanNames = beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        Object colorFactryBean = context.getBean("colorFactryBean");
        System.out.println(colorFactryBean.getClass());
    }
}
