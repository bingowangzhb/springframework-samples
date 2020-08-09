package com.bgw.ioc.annotation.sample3;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * MyImportSelector
 *
 * @author wang
 * @since 2020/8/9 22:50
 **/
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("----------------------MyImportSelector----------------");
        return new String[]{"com.bgw.ioc.annotation.sample3.Cat"};
    }
}
