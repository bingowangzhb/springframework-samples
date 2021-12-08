package com.bgw.spring.ioc.xml.sample2;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SampleTestCase
 *
 * @author zhibin.bgw
 * @since 2019-11-23 19:13
 **/
public class Sample2TestCase {
    private ApplicationContext applicationContext;
    private String configLocation;
    @Before
    public void init() {
        configLocation = "config/application-context-sample2.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }


    @Test
    public void testFoo() {
        System.out.println(applicationContext.getBean("foo").hashCode());
    }

    @Test
    public void testExampleBeanOne() {
        System.out.println(applicationContext.getBean("exampleBeanOne"));
    }

}
