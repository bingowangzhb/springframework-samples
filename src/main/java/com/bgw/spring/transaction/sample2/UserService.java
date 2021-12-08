package com.bgw.spring.transaction.sample2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * UserService
 *
 * @author bgw
 * @since 2020/8/27 14:55
 **/
@Service
public class UserService {

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveWithTransactionTemplate() {
        transactionTemplate.execute(transactionStatus -> {
            String sql = "insert into `test`.user(name, age) values ('james', 22)";
            jdbcTemplate.update(sql);
            // System.out.println(1 / 0);
            return null;
        });

    }

    public void saveWithTransactionManager() {
        // 构造一个描述事务的定义信息
        DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        // 事务是否只读
        transactionDefinition.setReadOnly(false);
        // 隔离级别 -1 默认使用数据库隔离级别  mysql默认可重复读
        transactionDefinition.setIsolationLevel(TransactionDefinition.ISOLATION_DEFAULT);
        // 事务传播行为
        transactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

        TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
        try {
            String sql = "insert into `test`.user(name, age) values ('james2', 23)";
            jdbcTemplate.update(sql);
            // System.out.println(1 / 0);
            transactionManager.commit(transactionStatus);
        } catch (DataAccessException e) {
            e.printStackTrace();
            transactionManager.rollback(transactionStatus);
        }
    }
}
