package com.bgw.spring.ioc.annotation.sample2.config;

import com.bgw.spring.ioc.entity.Dog;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ambow
 * @since 2021/10/27 17:29
 */
public class MyBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        // 能够拿到BeanDefinitionRegistry 手动注册
        RootBeanDefinition dogBean = new RootBeanDefinition();
        dogBean.setBeanClassName("dogBean");
        dogBean.setBeanClass(Dog.class);
        dogBean.getPropertyValues().add("name", "tuzi");

        registry.registerBeanDefinition("dogBean", dogBean);
    }
}
