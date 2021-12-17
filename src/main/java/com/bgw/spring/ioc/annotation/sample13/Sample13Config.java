package com.bgw.spring.ioc.annotation.sample13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ambow
 * @since 2021/12/17 16:49
 */
@ComponentScan(basePackages = "com.bgw.spring.ioc.annotation.sample13")
@Configuration
public class Sample13Config {

    @Bean
    public FullBean fullBean() {
        return new FullBean();
    }

    @Bean
    public String name(FullBean fullBean) {
        System.out.println("fullBean().hashCode() = " + fullBean().hashCode());
        System.out.println("fullBean().hashCode() = " + fullBean().hashCode());
        return fullBean.getClass().getName();
    }

}