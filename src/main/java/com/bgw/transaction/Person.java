package com.bgw.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * Person
 *
 * @author wang
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
