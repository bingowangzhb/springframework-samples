package com.bgw.aop.sample3;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * HelloServiceMethodInterceptor02
 *
 * @author zhibin.wang
 * @since 2020/08/18 13:56
 */
public class HelloServiceMethodInterceptor02 implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("-----------------------HelloServiceMethodInterceptor02:start----------------");
        System.out.println("invocation.getClass() = " + invocation.getClass());
        System.out.println("invocation.getMethod().getName() = " + invocation.getMethod().getName());
        Object retVal = invocation.proceed();
        System.out.println("retVal = " + retVal);
        System.out.println("-----------------------HelloServiceMethodInterceptor02:end----------------");
        return retVal;
    }
}
