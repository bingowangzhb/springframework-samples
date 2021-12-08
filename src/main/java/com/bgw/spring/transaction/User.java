package com.bgw.spring.transaction;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Person
 *
 * @author bgw
 * @since 2020/8/27 10:41
 **/
@Data
@Getter
@Setter
public class User {
    private Integer id;
    private String name;
    private Integer age;
}
