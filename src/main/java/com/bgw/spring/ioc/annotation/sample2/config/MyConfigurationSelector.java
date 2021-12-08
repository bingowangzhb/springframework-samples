package com.bgw.spring.ioc.annotation.sample2.config;

import com.bgw.spring.ioc.entity.Person;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ambow
 * @since 2021/10/27 17:24
 */
public class MyConfigurationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Person.class.getName()};
    }
}
