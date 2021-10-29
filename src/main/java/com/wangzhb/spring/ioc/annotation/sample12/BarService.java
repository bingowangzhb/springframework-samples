package com.wangzhb.spring.ioc.annotation.sample12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * BarService
 *
 * @author wangzhb
 * @since 2020/4/9 21:49
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BarService {

    private GenericBean<String, String> genericStringBean;

    private GenericBean<Object, Object> genericObjBean;

    private Parent parentOne;

    private List<GenericBean<?, ?>> genericBeans;

    private Map<String, GenericBean<?, ?>> genericBeanMap;

    private Map<String, GenericBean<String, String>> genericStringBeanMap;
}
