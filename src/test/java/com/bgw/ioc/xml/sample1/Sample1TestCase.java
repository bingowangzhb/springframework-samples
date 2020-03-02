package com.bgw.ioc.xml.sample1;

import com.bgw.ioc.xml.sample11.ClientService;
import com.bgw.ioc.xml.sample11.ExampleBean;
import com.bgw.ioc.xml.sample11.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * SampleTestCase
 *
 * @author zhibin.wang
 * @since 2019-11-23 19:13
 **/
public class Sample1TestCase {

    private ApplicationContext applicationContext;
    private String configLocation;
    @Before
    public void init() {
        configLocation = "config/application-context-sample1.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }



    @Test
    public void testContext() {
        // applicationContext.getBean("person");
        applicationContext.getBean(Person.class);
    }
}
