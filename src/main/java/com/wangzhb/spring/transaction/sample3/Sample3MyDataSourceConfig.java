package com.wangzhb.spring.transaction.sample3;

import com.wangzhb.spring.transaction.CommonConfigurationSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;
import org.springframework.transaction.interceptor.MethodMapTransactionAttributeSource;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.RollbackRuleAttribute;
import org.springframework.transaction.interceptor.RuleBasedTransactionAttribute;
import org.springframework.transaction.interceptor.TransactionAttribute;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * MyDataSourceConfig
 *
 * @author wangzhb
 * @since 2020/8/27 17:13
 **/
@ComponentScan({"com.wangzhb.spring.transaction.sample3"})
@Import(CommonConfigurationSelector.class)
@Configuration
@EnableTransactionManagement
public class Sample3MyDataSourceConfig {


    @Bean
    public TransactionInterceptor transactionInterceptor1(PlatformTransactionManager transactionManager) {
        Map<String, TransactionAttribute> txMap = new HashMap<>(8);

        // 基于规则的属性源
        RuleBasedTransactionAttribute requiredTx = new RuleBasedTransactionAttribute();
        // 回滚规则
        requiredTx.setRollbackRules(Collections.singletonList(new RollbackRuleAttribute(RuntimeException.class)));
        // 传播行为
        requiredTx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        txMap.put("add*", requiredTx);
        txMap.put("create*", requiredTx);
        txMap.put("save*", requiredTx);
        txMap.put("insert*", requiredTx);
        txMap.put("update*", requiredTx);
        txMap.put("delete*", requiredTx);

        // 查询 只读事务
        RuleBasedTransactionAttribute readOnlyTx = new RuleBasedTransactionAttribute();
        readOnlyTx.setReadOnly(true);
        readOnlyTx.setPropagationBehavior(TransactionDefinition.PROPAGATION_NOT_SUPPORTED);
        txMap.put("select*", readOnlyTx);
        txMap.put("query*", readOnlyTx);
        txMap.put("list*", readOnlyTx);
        txMap.put("get*", readOnlyTx);

        // 定义事务属性源
        NameMatchTransactionAttributeSource tas = new NameMatchTransactionAttributeSource();
        tas.setNameMap(txMap);

        // 返回事务拦截器
        return new TransactionInterceptor(transactionManager, tas);
    }


    @Bean
    public TransactionInterceptor transactionInterceptor2(PlatformTransactionManager transactionManager) {

        DefaultTransactionAttribute readOnlyTx = new DefaultTransactionAttribute();
        readOnlyTx.setReadOnly(true);
        readOnlyTx.setPropagationBehavior(TransactionDefinition.PROPAGATION_NOT_SUPPORTED);

        MethodMapTransactionAttributeSource tas = new MethodMapTransactionAttributeSource();
        tas.addTransactionalMethod("com.bgw.spring.transaction.sample3.PersonServiceImpl.get*", readOnlyTx);

        // 返回事务拦截器
        return new TransactionInterceptor(transactionManager, tas);
    }

}
