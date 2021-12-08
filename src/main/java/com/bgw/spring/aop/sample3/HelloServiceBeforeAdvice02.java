package com.bgw.spring.aop.sample3;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * HelloServiceBeforeAdvice02
 *
 * @author zhibin.bgw
 * @since 2020/08/18 14:10
 */
public class HelloServiceBeforeAdvice02 implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("--------------------HelloBeforeAdvice02:start-----------------");
        System.out.println("method.getName() = " + method.getName());
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("--------------------HelloBeforeAdvice02:end-----------------");
    }
}
