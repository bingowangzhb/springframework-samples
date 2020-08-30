package com.bgw.transaction.sample2;

import com.bgw.transaction.CommonConfigurationSelector;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Sample2MyDataSource
 *
 * @author wang
 * @since 2020/8/27 14:51
 **/
@Import(CommonConfigurationSelector.class)
@Configuration
@ComponentScan({"com.bgw.transaction.sample2"})
public class Sample2MyDataSourceConfig {

    @Bean
    public DataSource dataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setURL("jdbc:mysql://localhost:3306/test");

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
