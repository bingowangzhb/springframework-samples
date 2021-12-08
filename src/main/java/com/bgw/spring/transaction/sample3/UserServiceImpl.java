package com.bgw.spring.transaction.sample3;

import com.bgw.spring.transaction.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * PersonServiceImpl
 *
 * @author bgw
 * @since 2020/8/27 17:15
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public void save(User user) {
        String sql = "insert into user(name, age) values (?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getAge());
        System.out.println(1 / 0);
        System.out.println("--------------------------------------");
    }

    @Override
    public void get() {
        System.out.println("get");
    }
}
