package com.bgw.spring.transaction.sample1;

import com.bgw.spring.transaction.sample1.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * SpringTest
 *
 * @author bgw
 * @since 2020/8/27 10:28
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Sample1MyDataSourceConfig.class})
public class SpringTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    private PersonService personService;

    @Test
    public void test1() throws Exception {
        System.out.println("dataSource = " + dataSource);
        System.out.println("dataSource.getConnection() = " + dataSource.getConnection());
        System.out.println("jdbcTemplate = " + jdbcTemplate);
        System.out.println("namedParameterJdbcTemplate = " + namedParameterJdbcTemplate);
    }

    @Test
    public void test2() {
        personService.save(null);
    }

}
