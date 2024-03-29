package com.bgw.spring.aop.sample1;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * MyMethodInterceptor
 *
 * @author bgw
 * @since 2020/8/16 00:10
 **/
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object result;
        try {
            System.out.println("@Before");
            result = invocation.proceed();
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("@AfterThrowing");
            throw throwable;
        }
        finally {
            System.out.println("@After");
        }

        System.out.println("@AfterReturning");

        return result;
    }
}
