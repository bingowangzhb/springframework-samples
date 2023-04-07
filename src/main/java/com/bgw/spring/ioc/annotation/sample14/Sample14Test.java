package com.bgw.spring.ioc.annotation.sample14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Sample14Test {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Sample14Config.class);
        System.out.println("context.getBean(\"smaple14\") = " + context.getBean("smaple14"));
    }
}
