package com.bgw.spring.transaction.sample3;

import com.bgw.spring.transaction.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Sample3Test
 *
 * @author bgw
 * @since 2020/8/27 17:24
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Sample3Config.class})
public class Sample3Test {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        System.out.println("userService.getClass() = " + userService.getClass());
        User user = new User();
        user.setName("zagg");
        user.setAge(24);
        userService.save(user);
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Sample3Config.class);
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        System.out.println("userService.getClass() = " + userService.getClass());
        userService.save(null);
    }

}
