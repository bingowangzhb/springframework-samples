package com.bgw.spring.ioc.annotation.sample13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author ambow
 * @since 2021/12/17 17:00
 */
public class Sample13Test {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Sample13Config.class);

        //LiteBean liteBean = (LiteBean) context.getBean("liteBean");
        //System.out.println("liteBean.hashCode() = " + liteBean.hashCode());
    }
}
