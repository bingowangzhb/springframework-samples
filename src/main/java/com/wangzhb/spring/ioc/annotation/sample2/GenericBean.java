package com.wangzhb.spring.ioc.annotation.sample2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * GenericBean
 *
 * @author wangzhb
 * @since 2020/4/8 23:10
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GenericBean<T, W> {

    private T t;
    private W w;
}
