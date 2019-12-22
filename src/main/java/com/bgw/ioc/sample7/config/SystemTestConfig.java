package com.bgw.ioc.sample7.config;

import com.bgw.ioc.sample7.DataSource;
import com.bgw.ioc.sample7.DefaultDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * SystemTestConfig
 *
 * @author zhibin.wang
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
