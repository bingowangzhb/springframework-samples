package com.wangzhb.spring.ioc.xml.sample9;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sample9TestCase
 *
 * @author zhibin.wangzhb
 * @since 2020/10/24 11:12
 */
public class Sample9TestCase {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        String configLocation = "config/application-context-sample9.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }

    @Test
    public void testFactoryBean() {
        System.out.println(applicationContext.getBean("myDataSource"));
    }
}
