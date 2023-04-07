package com.bgw.spring.core;

import org.junit.Test;
import org.springframework.core.ResolvableType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ResolvableTypeTest
 *
 * @author zhibin.bgw
 * @since 2021/01/19 13:43
 */
public class ResolvableTypeTest {

    private HashMap<String, List<Integer>> myMap;

    public static void main(String[] args) throws Exception {

    }

    @Test
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


    interface Service<M, N> {
    }
    class ServiceImpl<M, N> implements Service<M, N> {
        private M m;
        private N n;

        public ServiceImpl(List<List<String>> list, Map<String, Map<Integer, List<String>>> map) {
        }
    }

    class MyServiceImpl extends ServiceImpl<String, Integer> {

        public MyServiceImpl(List<List<String>> list, Map<String, Map<Integer, List<String>>> map) {
            super(list, map);
        }
    }

    @Test
    public void test() {
        ResolvableType resolvableType = ResolvableType.forClass(MyServiceImpl.class);
        System.out.println("resolvableType.resolve() = " + resolvableType.resolve());

        ResolvableType superType = ResolvableType.forClass(Service.class);
        System.out.println("superType.getType() = " + superType.getType());
        System.out.println("superType.getGeneric(0) = " + superType.getGeneric(0));
        System.out.println("superType.getGeneric(1) = " + superType.getGeneric(1));
    }
}
