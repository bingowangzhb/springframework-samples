package com.bgw.aop.sample2;

import com.bgw.aop.sample2.service.BarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Sample2Main
 *
 * @author wang
 * @since 2020/8/9 23:22
 **/
public class Sample2Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Sample2AopConfig.class);

        BarService barService = applicationContext.getBean(BarService.class);

        // proxyTargetClass = false 默认 Jdk动态代理
        // proxyTargetClass = true CGLIB动态代理
        System.out.println(barService.getClass());
        barService.bar();
    }
}
