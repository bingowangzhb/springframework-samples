package com.bgw.spring.transaction.sample3;

import com.bgw.spring.transaction.Person;
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
@ContextConfiguration(classes = {Sample3MyDataSourceConfig.class})
public class Sample3Test {

    @Autowired
    private PersonService personService;

    @Test
    public void test1() {
        System.out.println("personService.getClass() = " + personService.getClass());
        Person person = new Person();
        person.setName("zagg");
        person.setAge(24);
        personService.save(person);
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Sample3MyDataSourceConfig.class);
        PersonService personService = (PersonService) applicationContext.getBean("personService");
        System.out.println("personService.getClass() = " + personService.getClass());
        personService.save(null);
    }

}
