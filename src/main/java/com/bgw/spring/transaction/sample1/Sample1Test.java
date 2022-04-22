package com.bgw.spring.transaction.sample1;

import com.bgw.spring.transaction.sample2.Sample2Config;
import com.bgw.spring.transaction.sample2.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Sample2Test
 *
 * @author bgw
 * @since 2020/8/27 15:01
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Sample2Config.class})
public class Sample1Test {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.saveWithTransactionTemplate();
    }

    @Test
    public void test2() {
        userService.saveWithTransactionManager();
    }
}
