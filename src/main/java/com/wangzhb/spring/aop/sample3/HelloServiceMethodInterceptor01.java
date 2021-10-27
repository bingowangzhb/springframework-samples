package com.wangzhb.spring.aop.sample3;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * HelloServiceMethodInterceptor01
 *
 * @author zhibin.wangzhb
 * @since 2020/08/18 13:50
 */
public class HelloServiceMethodInterceptor01 implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("-----------------------HelloServiceMethodInterceptor01:start----------------");
        System.out.println("invocation.getClass() = " + invocation.getClass());
        System.out.println("invocation.getMethod().getName() = " + invocation.getMethod().getName());
        Object retVal = invocation.proceed();
        System.out.println("retVal = " + retVal);
        System.out.println("-----------------------HelloServiceMethodInterceptor01:end----------------");
        return retVal;
    }
}
