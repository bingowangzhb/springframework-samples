package com.bgw.ioc.sample7.config;

import com.bgw.ioc.sample7.AccountRepository;
import com.bgw.ioc.sample7.DataSource;
import com.bgw.ioc.sample7.JdbcAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    private final DataSource dataSource;

    @Autowired
    public RepositoryConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public AccountRepository accountRepository() {
        return new JdbcAccountRepository(dataSource);
    }
}
