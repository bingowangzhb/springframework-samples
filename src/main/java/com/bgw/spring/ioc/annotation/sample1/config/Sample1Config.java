package com.bgw.spring.ioc.annotation.sample1.config;

import com.bgw.spring.ioc.entity.Monkey;
import com.bgw.spring.ioc.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ambow
 * @since 2021/10/27 14:06
 */
@Configuration
public class Sample1Config {

    /**
     * 如果没有指定name属性，则默认取方法名
     *
     * @return Person
     */
    @Bean
    public Person person() {
        return new Person();
    }

    @Bean(name = "mky")
    public Monkey monkey() {
        return new Monkey();
    }
}
