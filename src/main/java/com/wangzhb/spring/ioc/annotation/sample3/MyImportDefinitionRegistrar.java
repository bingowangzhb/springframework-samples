package com.wangzhb.spring.ioc.annotation.sample3;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * MyBeanDefinitionRegistrar
 *
 * @author wangzhb
 * @since 2020/8/9 22:49
 **/
public class MyImportDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        System.out.println(importingClassMetadata.getClass());

    }
}
