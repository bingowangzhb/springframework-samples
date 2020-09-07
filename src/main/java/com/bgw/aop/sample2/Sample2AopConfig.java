package com.bgw.aop.sample2;

import com.bgw.aop.sample2.service.BarService;
import com.bgw.aop.sample2.service.BarServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Sample2AopConfig
 *
 * @author wang
 * @since 2020/8/9 23:14
 **/
@Configuration
@ComponentScan({"com.bgw.aop.sample2.service"})
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
