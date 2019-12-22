package com.bgw.ioc.sample8.config;

import com.bgw.ioc.sample8.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig
 *
 * @author zhibin.wang
 * @since 2019-12-22 21:16
 **/
@Configuration
public class Sample8Config {

    @Bean
    public Person person() {
        return new Person("James", 23);
    }

}
