package com.bgw.aop.sample2;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * MyAspect
 *
 * @author wang
 * @since 2020/8/9 23:14
 **/
@Aspect
public class MyAspect {
    @Pointcut("execution(* com.bgw.aop.sample2.service.*.*(..)) ")
    public void pointcut() {
    }

    /**
     *
     */
    @Before("pointcut()")
    public void before() {
        System.out.println("this is from MyAspect#before...");
    }

    /**
     *
     */
    @After("pointcut()")
    public void after() {
        System.out.println("this is from MyAspect#after...");
    }

    /**
     * @AfterReturning("pointcut()")
     */
    public void afterReturning() {
        System.out.println("this is from MyAspect#afterReturning...");
    }

    /**
     * @AfterThrowing("pointcut()")
     */
    public void afterThrowing() {
        System.out.println("this is from MyAspect#afterThrowing...");
    }

    /**
     * 此处需要注意：若写了@Around方法，那么最后只会执行@Around和@AfterReturning 其它的都不会执行
     *  @Around("pointcut()")
     */
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("this is from HelloAspect#around...");
        // 获取方法参数值数组
        Object[] args = joinPoint.getArgs();
        // 得到其方法签名
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        // 获取方法参数类型数组
        Class[] paramTypeArray = methodSignature.getParameterTypes();
        System.out.println("请求参数为:" + args);
        // 动态修改其参数
        // 注意，如果调用joinPoint.proceed()方法，则修改的参数值不会生效，必须调用joinPoint.proceed(Object[] args)
        Object result = joinPoint.proceed(args);
        System.out.println("响应结果为: " + result);
        // 如果这里不返回result，则目标对象实际返回值会被置为null
        return result;
    }
}
