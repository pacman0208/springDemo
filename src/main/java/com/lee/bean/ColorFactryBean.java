package com.lee.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 10:07 AM
 * @Software: IntelliJ IDEA
 * @Description:
 */
public class ColorFactryBean implements FactoryBean {
    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }
}
