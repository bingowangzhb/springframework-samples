package com.bgw.spring.transaction.sample1.service.impl;

import com.bgw.spring.transaction.User;
import com.bgw.spring.transaction.sample1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * PersonServiceImpl
 *
 * @author bgw
 * @since 2020/8/27 10:42
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public void save(User user) {

        System.out.println("----------------");

    }
}
