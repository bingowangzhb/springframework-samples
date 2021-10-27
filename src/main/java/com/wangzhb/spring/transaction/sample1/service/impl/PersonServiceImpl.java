package com.wangzhb.spring.transaction.sample1.service.impl;

import com.wangzhb.spring.transaction.Person;
import com.wangzhb.spring.transaction.sample1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * PersonServiceImpl
 *
 * @author wangzhb
 * @since 2020/8/27 10:42
 **/
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public void save(Person person) {

        System.out.println("----------------");

    }
}
