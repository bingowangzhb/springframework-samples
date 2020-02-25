package com.bgw.ioc.sample1;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * SampleTestCase
 *
 * @author zhibin.wang
 * @since 2019-11-23 19:13
 **/
public class Sample1TestCase {

    private ApplicationContext applicationContext;
    private String configLocation;
    @Before
    public void init() {
        configLocation = "config/application-context-sample1.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }



    @Test
    public void testContext() {
        printPerson(applicationContext);
    }

    @Test
    public void testGenericContext() {
        GenericApplicationContext context = new GenericApplicationContext();
        XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(context);
        xmlReader.loadBeanDefinitions(configLocation);
        context.refresh();

        printPerson(context);
    }


    @Test
    public void testExampleBean() {
        // 没有id 属性 使用name属性，如果二者都不匹配报错
        ExampleBean bean = applicationContext.getBean(ExampleBean.class);
        System.out.println("ExampleBean : " + bean.hashCode());

        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println("beanDefinitionName : " + beanDefinitionName);
        }

    }

    @Test
    public void testClientService() {
        // 没有id 属性 使用name属性，如果二者都不匹配报错
        ClientService bean = applicationContext.getBean(ClientService.class);
        System.out.println("ClientService : " + bean.hashCode());

        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println("beanDefinitionName : " + beanDefinitionName);
        }

    }
    @Test
    public void testPersonService() {
        // 没有id 属性 使用name属性，如果二者都不匹配报错
        PersonService bean = applicationContext.getBean(PersonService.class);
        System.out.println("PersonService : " + bean.hashCode());

    }


    private void printPerson(ApplicationContext context) {
        Person person = (Person) context.getBean("person");
        System.out.println("person.name = " + person.getName());
        System.out.println("person.age = " + person.getAge());
    }
}
