package com.bgw.ioc.xml.sample1;

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
public class Sample1TestCase {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        String configLocation = "config/application-context-sample1.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }



    @Test
    public void testContext() {
        // applicationContext.getBean("");
        // applicationContext.getBean("str");

        Cat cat = (Cat) applicationContext.getBean("cat");

        System.out.println(cat.getName() + ": " + cat.getType());
    }
}
