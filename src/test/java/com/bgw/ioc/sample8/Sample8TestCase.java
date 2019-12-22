package com.bgw.ioc.sample8;

import com.bgw.ioc.sample6.TransferService;
import com.bgw.ioc.sample6.config.SystemTestConfig;
import com.bgw.ioc.sample8.config.Sample8Config;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Sample8TestCase
 *
 * @author zhibin.wang
 * @since 2019-12-22 21:20
 **/
public class Sample8TestCase {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(Sample8Config.class);
    }

    @Test
    public void testOnly() {
        System.out.println(applicationContext.getBean(Person.class));
    }
}
