package com.bgw.spring.ioc.annotation.sample5;

import com.bgw.spring.ioc.annotation.sample5.config.Sample5Config;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Sample8TestCase
 *
 * @author zhibin.bgw
 * @since 2019-12-22 21:20
 **/
public class Sample5TestCase {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(Sample5Config.class);
    }

    @Test
    public void testOnly() {
//        System.out.println("applicationContext.getBean(\"beanAFactoryBean\") = " + applicationContext.getBean("beanAFactoryBean"));
        System.out.println("applicationContext.getBean(\"&beanAFactoryBean\") = " + applicationContext.getBean("&beanAFactoryBean"));
    }
}

/*
 * class sun.misc.Launcher$AppClassLoader
 * class sun.misc.Launcher$AppClassLoader
 * class sun.misc.Launcher$AppClassLoader
 */