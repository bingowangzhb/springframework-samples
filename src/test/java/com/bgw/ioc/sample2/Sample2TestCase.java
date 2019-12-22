package com.bgw.ioc.sample2;

import com.bgw.ioc.sample1.ClientService;
import com.bgw.ioc.sample1.ExampleBean;
import com.bgw.ioc.sample1.Person;
import com.bgw.ioc.sample1.PersonService;
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
