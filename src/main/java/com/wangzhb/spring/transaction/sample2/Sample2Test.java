package com.wangzhb.spring.transaction.sample2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Sample2Test
 *
 * @author wangzhb
 * @since 2020/8/27 15:01
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Sample2MyDataSourceConfig.class})
public class Sample2Test {

    @Autowired
    private PersonService personService;

    @Test
    public void test1() {
        personService.saveWithTransactionTemplate();
    }

    @Test
    public void test2() {
        personService.saveWithTransactionManager();
    }
}
