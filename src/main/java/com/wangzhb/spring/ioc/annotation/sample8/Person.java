package com.wangzhb.spring.ioc.annotation.sample8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Person
 *
 * @author zhibin.wangzhb
 * @since 2019-12-22 21:17
 **/
public class Person implements InitializingBean, DisposableBean {

    private String name;

    private Integer age;

    public Person() {
        System.out.println("---------Person NoArgsConstructor---------");
    }

    public Person(String name, Integer age) {
        System.out.println("---------Person AllArgsConstructor---------");
        this.name = name;
        this.age = age;
    }


    public void initMethod() {
        System.out.println("------------Person init Method---------------");
    }

    public void destroyMethod() {
        System.out.println("------------Person destroy Method---------------");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("------------Person postConstruct---------------");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("------------Person preDestroy---------------");
    }


    @Override
    public void destroy() {
        System.out.println("------------Person destroy---------------");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("------------Cat afterPropertiesSet---------------");
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
