package com.bgw.ioc.annotation.sample1;

import com.bgw.ioc.annotation.sample1.config.SystemTestConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * SampleTestCase
 *
 * @author zhibin.wang
 * @since 2019-11-23 19:13
 **/
public class Sample6TestCase {
    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(SystemTestConfig.class);
        ((ConfigurableApplicationContext) applicationContext).registerShutdownHook();
    }

    @Test
    public void testDependency() {
        TransferService transferService = applicationContext.getBean(TransferService.class);
        transferService.transfer(100.00, "A123", "C456");
    }
}
