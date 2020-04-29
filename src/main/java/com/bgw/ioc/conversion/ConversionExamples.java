package com.bgw.ioc.conversion;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ConversionExamples
 */
public class ConversionExamples {

    public static void main(String[] args) {
        DefaultConversionService defaultConversionService = new DefaultConversionService();
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 5, 6, 9, 11, 34));
        Object obj = defaultConversionService.convert(integerList, TypeDescriptor.forObject(integerList),
                TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(String.class)));

        if (obj instanceof List) {
            List<String> str = (List<String>)obj;
            str.forEach(o -> System.out.println(o.getClass() + ", " + o));
        }
    }
}
