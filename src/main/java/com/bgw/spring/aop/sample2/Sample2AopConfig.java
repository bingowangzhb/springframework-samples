package com.bgw.spring.aop.sample2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Sample2AopConfig
 *
 * @author bgw
 * @since 2020/8/9 23:14
 **/
@Configuration
@ComponentScan({"com.bgw.spring.aop.sample2.service"})
public class Sample2AopConfig {

//    @Bean
//    public MyAspect myAspect() {
//        return new MyAspect();
//    }
//
//    @Bean
//    public BarService barService() {
//        return new BarServiceImpl();
//    }

}
