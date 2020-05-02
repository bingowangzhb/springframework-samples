package com.bgw.ioc.beandefinition;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BeanDefinitionTestCase
 *
 * @author wang
 * @since 2020/4/13 23:23
 **/
public class BeanDefinitionTestCase {

    @Test
    public void testBeanDefinition() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        RootBeanDefinition rbd = new RootBeanDefinition();
        rbd.getPropertyValues().add("name", "James");
        rbd.setBeanClass(Parent.class);

        ChildBeanDefinition cbd = new ChildBeanDefinition("parent");
        cbd.getPropertyValues().add("age", 22);

        applicationContext.registerBeanDefinition("parent", rbd);
        applicationContext.registerBeanDefinition("child", cbd);
        applicationContext.refresh();

        System.out.println(applicationContext.getBean("parent"));
        System.out.println(applicationContext.getBean("child"));

        BeanDefinition childBd = applicationContext.getBeanDefinition("child");
        BeanDefinition mergeChildBd = applicationContext.getBeanFactory().getMergedBeanDefinition("child");
        System.out.println(1);
    }

}
