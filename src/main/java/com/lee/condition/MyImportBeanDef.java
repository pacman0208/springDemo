package com.lee.condition;

import com.lee.bean.Rainbow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 9:53 AM
 * @Software: IntelliJ IDEA
 * @Description: 向容器导入多个对象的方法
 */
public class MyImportBeanDef implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean b = registry.containsBeanDefinition("com.lee.bean.RedColor");
        boolean b1 = registry.containsBeanDefinition("com.lee.bean.BlueColor");
        if(b && b1){
            BeanDefinition definition = new RootBeanDefinition(Rainbow.class);
            registry.registerBeanDefinition("rainbow",definition);
        }
    }
}
