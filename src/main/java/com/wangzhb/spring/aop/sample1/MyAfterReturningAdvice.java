package com.wangzhb.spring.aop.sample1;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * MyAfterReturningAdvice
 *
 * @author wangzhb
 * @since 2020/8/15 21:50
 **/
public class MyAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

    }
}
