package com.bgw.transaction.sample1;

import com.bgw.transaction.CommonConfigurationSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * MyDataSourceConfig
 *
 * @author wang
 * @since 2020/8/27 10:20
 **/
@Import(CommonConfigurationSelector.class)
@Configuration
@ComponentScan(basePackages = {"com.bgw.transaction.sample1.service"})
public class Sample1MyDataSourceConfig {
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
