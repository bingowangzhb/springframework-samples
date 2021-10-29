package com.wangzhb.spring.ioc.annotation.sample2.config;

import com.wangzhb.spring.ioc.entity.Monkey;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ambow
 * @since 2021/10/27 14:48
 */
@Configuration
public class AnimalConfig {

    @Bean
    public Monkey monkey() {
        return new Monkey();
    }
}
