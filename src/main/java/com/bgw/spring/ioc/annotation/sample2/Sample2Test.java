package com.bgw.spring.ioc.annotation.sample2;

import com.bgw.spring.ioc.annotation.sample2.config.Sample2Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author ambow
 * @since 2021/10/27 14:47
 */
public class Sample2Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Sample2Config.class);
        Arrays.stream(context.getBeanDefinitionNames())
                .filter(n -> !n.contains("internal"))
                .forEach(System.out::println);
    }
}
