package com.wangzhb.spring.transaction;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Person
 *
 * @author wangzhb
 * @since 2020/8/27 10:41
 **/
@Data
@Getter
@Setter
public class Person {
    private Integer id;
    private String name;
    private Integer age;
}
