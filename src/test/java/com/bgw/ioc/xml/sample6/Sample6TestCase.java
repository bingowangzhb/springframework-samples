package com.bgw.ioc.xml.sample6;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SampleTestCase
 *
 * @author zhibin.wang
 * @since 2019-11-23 19:13
 **/
public class Sample6TestCase {
    private ApplicationContext applicationContext;

    @Before
    public void init() {
        String configLocation = "config/application-context-sample6.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }

    @Test
    public void testFactoryBean() {
        System.out.println(applicationContext.getBean("clientService"));
    }
}
