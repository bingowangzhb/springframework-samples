package com.bgw.ioc.annotation.sample2;

import com.bgw.ioc.annotation.sample2.config.Sample2Config;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Sample2TestCase
 *
 * @author wang
 * @since 2020/4/8 23:24
 **/
public class Sample2TestCase {


    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(Sample2Config.class);
    }

    @Test
    public void testFooService() {
        FooService fooService = applicationContext.getBean(FooService.class);
        System.out.println(fooService);
    }

    @Test
    public void testBarService() {
        BarService barService = applicationContext.getBean(BarService.class);
        System.out.println(barService);
    }

}
