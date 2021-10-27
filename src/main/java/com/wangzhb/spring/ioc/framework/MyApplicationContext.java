package com.wangzhb.spring.ioc.framework;

/**
 * MyApplicationContext
 *
 * @author zhibin.wangzhb
 * @since 2020/09/03 10:58
 */
public class MyApplicationContext implements MyBeanFactory {

    private MyDefaultBeanListableBeanFactory myBeanFactory;


    public MyApplicationContext() {
        this.myBeanFactory = new MyDefaultBeanListableBeanFactory();
    }

    @Override
    public Object getBean(String beanName) {
        return myBeanFactory.getBean("abcd");
    }



    public MyDefaultBeanListableBeanFactory getMyBeanFactory() {
        return myBeanFactory;
    }

    public void setMyBeanFactory(MyDefaultBeanListableBeanFactory myBeanFactory) {
        this.myBeanFactory = myBeanFactory;
    }
}
