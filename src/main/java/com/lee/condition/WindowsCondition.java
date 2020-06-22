package com.lee.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 9:15 AM
 * @Software: IntelliJ IDEA
 * @Description: Windows条件
 */
public class WindowsCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String property = conditionContext.getEnvironment().getProperty("os.name");

        return property.contains("Windows");
    }
}
