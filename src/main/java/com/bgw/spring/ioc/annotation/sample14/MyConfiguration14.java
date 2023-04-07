package com.bgw.spring.ioc.annotation.sample14;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhibin.wang
 */
@Configuration
public class MyConfiguration14 {

    @Bean
    public Sample14 sample14() {
        return new Sample14("MyConfiguration14");
    }
}
