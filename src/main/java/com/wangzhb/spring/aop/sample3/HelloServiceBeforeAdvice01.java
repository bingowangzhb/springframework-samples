package com.wangzhb.spring.aop.sample3;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * HelloServiceBeforeAdvice01
 *
 * @author zhibin.wangzhb
 * @since 2020/08/18 13:42
 */
public class HelloServiceBeforeAdvice01 implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("--------------------HelloBeforeAdvice01:start-----------------");
        System.out.println("method.getName() = " + method.getName());
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("--------------------HelloBeforeAdvice01:end-----------------");
    }
}
