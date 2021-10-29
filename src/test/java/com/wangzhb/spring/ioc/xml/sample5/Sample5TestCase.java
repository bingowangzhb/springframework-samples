package com.wangzhb.spring.ioc.xml.sample5;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SampleTestCase
 *
 * @author zhibin.wangzhb
 * @since 2019-11-23 19:13
 **/
public class Sample5TestCase {
    private ApplicationContext applicationContext;

    @Before
    public void init() {
        String configLocation = "config/application-context-sample5.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }

    @Test
    public void testBeanPostProcessor() {
        System.out.println(applicationContext.getBean("sampleBean"));
    }
}
