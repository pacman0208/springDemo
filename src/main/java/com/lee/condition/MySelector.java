package com.lee.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 9:34 AM
 * @Software: IntelliJ IDEA
 * @Description: 通过实现ImportSelector向容器导入类
 */
public class MySelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.lee.bean.RedColor","com.lee.bean.BlueColor"};
    }

    public Predicate<String> getExclusionFilter() {
        return null;
    }
}
