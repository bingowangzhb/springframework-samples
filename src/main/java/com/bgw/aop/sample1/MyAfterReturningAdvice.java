package com.bgw.aop.sample1;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.adapter.AfterReturningAdviceInterceptor;

import java.lang.reflect.Method;

/**
 * MyAfterReturningAdvice
 *
 * @author wang
 * @since 2020/8/15 21:50
 **/
public class MyAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

    }
}
