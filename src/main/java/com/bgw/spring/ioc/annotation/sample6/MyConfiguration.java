package com.bgw.spring.ioc.annotation.sample6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhibin.wang
 */
@Configuration
public class MyConfiguration {
    @Bean
    public Bar bar() {
        return new Bar();
    }
}
