package com.bgw.spring.ioc.annotation.sample1;

import com.bgw.spring.ioc.annotation.sample1.config.Sample1Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author ambow
 * @since 2021/10/27 14:24
 */
public class Sample1Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Sample1Config.class);
        Arrays.stream(context.getBeanDefinitionNames())
                .filter(s -> !s.contains("internal"))
                .forEach(s -> {
                    System.out.println(s + "=" + context.getBean(s));
                });
    }
}
