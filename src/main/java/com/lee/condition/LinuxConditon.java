package com.lee.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 9:19 AM
 * @Software: IntelliJ IDEA
 * @Description:Linux Condition条件
 */
public class LinuxConditon implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String property = conditionContext.getEnvironment().getProperty("os.name");

        return property.contains("Linux");
    }
}
