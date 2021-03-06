package com.bgw.ioc.annotation.sample2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Parent
 *
 * @author wang
 * @since 2020/4/8 23:13
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Parent {
    private String name;
}
