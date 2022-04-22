package com.bgw.spring.aop.sample2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BarService
 *
 * @author bgw
 * @since 2020/8/9 23:18
 **/
@Service("barService")
public class BarServiceImpl implements BarService {

    @Override
    public String bar(String name, int age) {
        System.out.println("-------------------------bar()------------------------------");
        System.out.println("name=" + name + ", age=" + age);

        return "Hello, " + name + ", age=" + age;
    }
}
