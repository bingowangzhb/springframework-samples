package com.bgw.ioc.sample3;

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
public class SampleTestCase {
    private ApplicationContext applicationContext;
    private String configLocation;
    @Before
    public void init() {
        configLocation = "config/application-context-sample3.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }

    @Test
    public void testCyclicalDependency() {
        CyclicalBean cyclicalBean = applicationContext.getBean(CyclicalBean.class);
        AnotherCyclicalBean anotherCyclicalBean = applicationContext.getBean(AnotherCyclicalBean.class);

        System.out.println(cyclicalBean);
        System.out.println(anotherCyclicalBean);
    }


    @Test
    public void testDependency() {
        ExampleBean exampleBean = (ExampleBean) applicationContext.getBean("exampleBean");
        System.out.println(exampleBean);
    }
}
