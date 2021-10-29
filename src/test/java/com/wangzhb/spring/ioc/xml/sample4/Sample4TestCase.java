package com.wangzhb.spring.ioc.xml.sample4;

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
public class Sample4TestCase {
    private ApplicationContext applicationContext;

    @Before
    public void init() {
        String configLocation = "config/application-context-sample4.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }

    @Test
    public void testFactoryBean() {
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        System.out.println(applicationContext.getBean("&car"));
        System.out.println(applicationContext.getBean("car").hashCode());
        System.out.println(applicationContext.getBean("car").hashCode());
    }
}
