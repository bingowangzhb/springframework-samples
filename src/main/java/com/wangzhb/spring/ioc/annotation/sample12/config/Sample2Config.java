package com.wangzhb.spring.ioc.annotation.sample12.config;

import com.wangzhb.spring.ioc.annotation.sample12.FooService;
import org.springframework.context.annotation.Bean;

/**
 * Sample2Config
 *
 * @author wangzhb
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

//    @Bean
//    public BarService barService() {
//        return new BarService();
//    }
}
