package com.bgw.spring.ioc.annotation.sample4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ambow
 * @since 2021/12/17 17:00
 */
public class Sample4Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Sample4Config.class);
        System.out.println("foo = " + context.getBean("foo"));
    }
}
