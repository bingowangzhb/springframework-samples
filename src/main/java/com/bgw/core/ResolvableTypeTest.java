package com.bgw.core;

import org.springframework.core.ResolvableType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ResolvableTypeTest
 *
 * @author zhibin.wang
 * @since 2021/01/19 13:43
 */
public class ResolvableTypeTest {

    private HashMap<String, List<Integer>> myMap;

    public static void main(String[] args) throws Exception {
        ResolvableTypeTest rtt = new ResolvableTypeTest();
        rtt.example();
    }

    public void example() throws Exception {
        ResolvableType resolvableType = ResolvableType.forField(getClass().getDeclaredField("myMap"));
        System.out.println("resolvableType.getRawClass() = " + resolvableType.getRawClass());
        System.out.println("resolvableType.getSuperType() = " + resolvableType.getSuperType());
        System.out.println("resolvableType.asMap() = " + resolvableType.asMap());
        System.out.println("resolvableType.getGeneric(0).resolve() = " + resolvableType.getGeneric(0).resolve());
        System.out.println("resolvableType.getGeneric(1).resolve() = " + resolvableType.getGeneric(1).resolve());

        System.out.println("resolvableType.getGeneric(1) = " + resolvableType.getGeneric(1));
        System.out.println("resolvableType.resolveGeneric(1, 0) = " + resolvableType.resolveGeneric(1, 0));


    }

}
