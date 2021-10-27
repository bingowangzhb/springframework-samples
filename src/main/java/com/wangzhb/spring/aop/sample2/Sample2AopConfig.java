package com.wangzhb.spring.aop.sample2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Sample2AopConfig
 *
 * @author wangzhb
 * @since 2020/8/9 23:14
 **/
@Configuration
@ComponentScan({"com.wangzhb.spring.aop.sample2.service"})
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
