package com.bgw.spring.ioc.annotation.sample3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Sample3Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Sample3Config.class);
        Arrays.stream(context.getBeanDefinitionNames())
                .filter(s -> !s.contains("internal"))
                .forEach(s -> {
                    System.out.println(s + "=" + context.getBean(s));
                });

        BarService barService = context.getBean(BarService.class);
        BarService.getFooService();

        System.out.println("BarService.getFooService() = " + BarService.getFooService());
    }

}
