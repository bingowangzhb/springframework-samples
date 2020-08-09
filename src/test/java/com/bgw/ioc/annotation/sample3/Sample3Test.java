package com.bgw.ioc.annotation.sample3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Sample3Test
 *
 * @author wang
 * @since 2020/8/9 22:52
 **/
public class Sample3Test {


    @Test
    public void testImportSelector() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Sample3Config.class);

        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);


    }
}
