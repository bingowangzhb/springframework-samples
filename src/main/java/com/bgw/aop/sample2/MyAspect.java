package com.bgw.aop.sample2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * MyAspect
 *
 * @author wang
 * @since 2020/8/9 23:14
 **/
@Aspect
public class MyAspect {
    // 只拦截service层的所有方法
    @Pointcut("execution(* com.bgw.aop.sample2.service.*.*(..)) ")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before() {
        System.out.println("this is from MyAspect#before...");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("this is from MyAspect#after...");
    }

    @AfterReturning("pointcut()")
    public void afterReturning() {
        System.out.println("this is from MyAspect#afterReturning...");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        System.out.println("this is from MyAspect#afterThrowing...");
    }

    // 此处需要注意：若写了@Around方法，那么最后只会执行@Around和@AfterReturning 其它的都不会执行
    //@Around("point()")
    //public void around() {
    //    System.out.println("this is from HelloAspect#around...");
    //}

}
