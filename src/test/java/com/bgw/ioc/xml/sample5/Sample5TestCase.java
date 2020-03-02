package com.bgw.ioc.xml.sample5;

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
public class Sample5TestCase {
    private ApplicationContext applicationContext;

    @Before
    public void init() {
        String configLocation = "config/application-context-sample15.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }

    @Test
    public void testBeanPostProcessor() {
        System.out.println(applicationContext.getBean("sampleBean"));
    }
}
