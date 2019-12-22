package com.bgw.ioc.sample3;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SampleTestCase
 *
 * @author zhibin.wang
 * @since 2019-11-23 19:13
 **/
public class Sample3TestCase {
    private ApplicationContext applicationContext;
    private BeanFactory bf;
    private String configLocation;
    @Before
    public void init() {
        configLocation = "config/application-context-sample3.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        bf = new ClassPathXmlApplicationContext(configLocation);

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
//        ExampleBean exampleBean1 = (ExampleBean) applicationContext.getBean("exampleBean");
//        ExampleBean exampleBean2 = (ExampleBean) bf.getBean("exampleBean");
//        System.out.println(exampleBean1);
//        System.out.println(exampleBean2);
//        System.out.println(applicationContext.getAutowireCapableBeanFactory().getClass());
//        System.out.println(applicationContext.getClass());
//        System.out.println(applicationContext.getClass());
//        System.out.println(bf.getClass());
        System.out.println("id : " + applicationContext.getId());
        ((AbstractApplicationContext)applicationContext).setDisplayName("dddd");
        System.out.println("abstractRefreshableApplicationContext beanFactory: " + ((AbstractRefreshableApplicationContext) applicationContext).getBeanFactory().getClass());
        System.out.println("displayName : " + applicationContext.getDisplayName());
        System.out.println("applicationContextName : " + applicationContext.getApplicationName());
    }
}
