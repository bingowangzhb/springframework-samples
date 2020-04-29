package com.bgw.ioc.annotation.sample2.config;

import com.bgw.ioc.annotation.sample2.FooService;
import com.bgw.ioc.annotation.sample2.GenericBean;
import com.bgw.ioc.annotation.sample2.Parent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Sample2Config
 *
 * @author wang
 * @since 2020/4/8 23:09
 **/
public class Sample2Config {


//    @Bean
//    public Parent parentOne() {
//        return new Parent("one");
//    }
//
//    @Bean
//    public Parent parentTwo() {
//        return new Parent("two");
//    }
//
//    @Bean
//    public GenericBean<String, String> genericStringBean() {
//        return new GenericBean<>("1t", "2w");
//    }
//
//    @Bean
//    public GenericBean<Object, Object> genericObjBean() {
//        return new GenericBean<>("objT", "objW");
//    }
//
    @Bean
    public FooService fooService() {
        return new FooService();
    }

}
