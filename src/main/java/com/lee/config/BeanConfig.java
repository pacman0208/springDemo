package com.lee.config;

import com.lee.bean.Color;
import com.lee.bean.ColorFactryBean;
import com.lee.bean.Person;
import com.lee.condition.LinuxConditon;
import com.lee.condition.MyImportBeanDef;
import com.lee.condition.MySelector;
import com.lee.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @Auther: Lee
 * @Date: 6/19/2020 8:39 AM
 * @Software: IntelliJ IDEA
 * @Description: bean配置文件
 */

@PropertySource({"classpath:/person.properties"})
@ComponentScan("com.lee.bean")
@Configuration
@Conditional({WindowsCondition.class})
@Import({Color.class, MySelector.class, MyImportBeanDef.class})//注入类到IOC容器，id默认是组件的全类名
public class BeanConfig {
    @Bean
    @Conditional({WindowsCondition.class})
    public Person person(){
        return new Person(65,"Bill Gates");
    }

    @Bean
    @Conditional({WindowsCondition.class})
    public Person defaultPerson(){
        return new Person();
    }

    @Bean
    @Conditional({LinuxConditon.class})
    public Person person1(){
        return new Person(59,"Linus");
    }

    @Bean
    public ColorFactryBean colorFactryBean(){
        return new ColorFactryBean();
    }
}
