package com.wangzhb.spring.ioc.annotation.sample1.config;

import com.wangzhb.spring.ioc.annotation.sample1.DataSource;
import com.wangzhb.spring.ioc.annotation.sample1.DefaultDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * SystemTestConfig
 *
 * @author zhibin.wangzhb
 * @since 2019-12-22 16:44
 **/
@Configuration
@Import({ServiceConfig.class, RepositoryConfig.class})
public class SystemTestConfig {

    @Bean
    public DataSource dataSource() {
        return new DefaultDataSource();
    }
}
