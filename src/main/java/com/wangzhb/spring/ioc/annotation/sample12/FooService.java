package com.wangzhb.spring.ioc.annotation.sample12;

import lombok.Data;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * FooService
 *
 * @author wangzhb
 * @since 2020/4/8 23:20
 **/

@Data
public class FooService {

//    @Autowired
//    private GenericBean<String, String> genericStringBean;
//
//    @Autowired
//    private GenericBean<Object, Object> genericObjBean;
//
//    @Autowired
//    private Parent parentOne;
//
//    @Autowired
//    private List<GenericBean<?, ?>> genericBeans;
//
//    @Autowired
//    private Map<String, GenericBean<?, ?>> genericBeanMap;
//
//    @Autowired
//    private Map<String, GenericBean<String, String>> genericStringBeanMap;

    @Autowired
    BeanFactory beanFactory;
}
