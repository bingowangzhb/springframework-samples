package com.wangzhb.spring.ioc.annotation.sample1.config;

import com.wangzhb.spring.ioc.annotation.sample1.AccountRepository;
import com.wangzhb.spring.ioc.annotation.sample1.DataSource;
import com.wangzhb.spring.ioc.annotation.sample1.JdbcAccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RepositoryConfig
 *
 * @author zhibin.wangzhb
 * @since 2019-12-22 16:43
 **/
@Configuration
public class RepositoryConfig {

    @Bean
    public AccountRepository accountRepository(DataSource dataSource) {
        return new JdbcAccountRepository(dataSource);
    }
}
