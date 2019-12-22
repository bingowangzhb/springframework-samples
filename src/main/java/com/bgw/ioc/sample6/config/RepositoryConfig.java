package com.bgw.ioc.sample6.config;

import com.bgw.ioc.sample6.AccountRepository;
import com.bgw.ioc.sample6.DataSource;
import com.bgw.ioc.sample6.JdbcAccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RepositoryConfig
 *
 * @author zhibin.wang
 * @since 2019-12-22 16:43
 **/
@Configuration
public class RepositoryConfig {

    @Bean
    public AccountRepository accountRepository(DataSource dataSource) {
        return new JdbcAccountRepository(dataSource);
    }
}
