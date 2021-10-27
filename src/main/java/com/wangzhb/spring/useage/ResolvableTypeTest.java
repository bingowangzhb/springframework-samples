package com.wangzhb.spring.useage;

import org.springframework.core.ResolvableType;

import java.util.HashMap;
import java.util.List;

/**
 * @author ambow
 * @since 2021/10/25 15:12
 */
public class ResolvableTypeTest {

    private HashMap<Integer, List<String>> myMap;

    public void example() throws Exception {

        ResolvableType t = ResolvableType.forField(getClass().getDeclaredField("myMap"));

        // java.util.HashMap<java.lang.Integer, java.util.List<java.lang.String>>
        System.out.println("t.getType() = " + t.getType());

        // 若实现了Map则返回为Map的ResolvableType类型 否则返回NONE
        // java.util.Map<java.lang.Integer, java.util.List<java.lang.String>>
        System.out.println("t.asMap() = " + t.asMap());

        // 返回正在管理的底层 Java 类（如果可用）； 否则为空。
        // class java.util.HashMap
        System.out.println("t.getRawClass() = " + t.getRawClass());

        // 第一个泛型
        System.out.println("t.getGeneric(0).resolve() = " + t.getGeneric(0).resolve());
        // 第二个泛型
        System.out.println("t.getGeneric(1).resolve() = " + t.getGeneric(1).resolve());
        //
        System.out.println("t.getGeneric(1) = " + t.getGeneric(1));
        // 返回索引为1的类的索引为0的类  List<String>
        System.out.println("t.resolveGeneric(1, 0) = " + t.resolveGeneric(1, 0));
    }



    public static void main(String[] args) throws Exception {
        ResolvableTypeTest t = new ResolvableTypeTest();
        t.example();
    }
}
