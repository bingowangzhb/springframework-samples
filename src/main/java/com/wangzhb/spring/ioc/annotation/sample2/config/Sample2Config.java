package com.wangzhb.spring.ioc.annotation.sample2.config;

import com.wangzhb.spring.ioc.annotation.sample2.EnableMyConfiguration;
import com.wangzhb.spring.ioc.entity.Cat;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author ambow
 * @since 2021/10/27 14:47
 */
@Configuration
@Import({AnimalConfig.class, MyBeanDefinitionRegistrar.class, Cat.class})
@EnableMyConfiguration(order = 1)
@EnableTransactionManagement
public class Sample2Config {
}
