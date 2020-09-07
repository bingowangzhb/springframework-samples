package com.bgw.ioc.framework;

/**
 * MyDefaultBeanListableBeanFactory
 *
 * @author zhibin.wang
 * @since 2020/09/03 11:12
 */
public class MyDefaultBeanListableBeanFactory extends MyAbstractAutowireCapableBeanFactory {


    @Override
    public Object getBean(String name) {
        Object bean = getSingleton(name, new MyObjectFactory<Object>() {
            @Override
            public Object getObject() {
                return createBean(name, new Object[] {});
            }
        });

        return null;
    }
}
