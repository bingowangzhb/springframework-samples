package com.bgw.ioc.annotation.sample10;

import com.bgw.ioc.annotation.sample10.config.Sample10Config;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Sample10TestCase
 *
 * @author zhibin.wang
 * @since 2021/03/10 11:24
 */
public class Sample10TestCase {
    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(Sample10Config.class);
    }

    @Test
    public void testOnly() {
    }
}
