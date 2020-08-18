package com.bgw.ioc.annotation.sample8;

import com.bgw.ioc.annotation.sample8.config.Sample8Config;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Sample8TestCase
 *
 * @author zhibin.wang
 * @since 2019-12-22 21:20
 **/
public class Sample8TestCase {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(Sample8Config.class);
    }

    @Test
    public void testOnly() {
        //System.out.println(applicationContext.getBean("person").getClass());
        //System.out.println(applicationContext.getBean("personHolder").getClass());
    }
}

/*
 * class sun.misc.Launcher$AppClassLoader
 * class sun.misc.Launcher$AppClassLoader
 * class sun.misc.Launcher$AppClassLoader
 */