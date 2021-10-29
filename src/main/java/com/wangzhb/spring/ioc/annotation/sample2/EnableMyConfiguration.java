package com.wangzhb.spring.ioc.annotation.sample2;

import com.wangzhb.spring.ioc.annotation.sample2.config.MyConfigurationSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ambow
 * @since 2021/10/27 18:10
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyConfigurationSelector.class)
public @interface EnableMyConfiguration {

    int order() default 0;
}
