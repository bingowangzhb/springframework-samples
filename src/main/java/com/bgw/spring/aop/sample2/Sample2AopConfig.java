package com.bgw.spring.aop.sample2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Sample2AopConfig
 *
 * @author bgw
 * @since 2020/8/9 23:14
 **/
@EnableAspectJAutoProxy
@Configuration
@ComponentScan({"com.bgw.spring.aop.sample2"})
public class Sample2AopConfig implements Config {
    //  nothing to config
}
