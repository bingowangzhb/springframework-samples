package com.bgw.spring.ioc.annotation.sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Constructor;

/**
 * @author ambow
 * @since 2021/12/17 17:00
 */
public class Sample6Test {
    public static void main(String[] args) throws Exception {
        // ApplicationContext context = new AnnotationConfigApplicationContext(Sample6Config.class);
        Class<Bar> clazz = Bar.class;
        Bar bar = clazz.getConstructor(new Class[0]).newInstance();
        System.out.println("bar = " + bar);
    }
}
