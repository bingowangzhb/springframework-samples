package com.wangzhb.spring.ioc.xml.sample11;

/**
 * ClientService 静态工厂实例化
 *
 * @author zhibin.wangzhb
 * @since 2019-11-24 15:48
 **/
public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {
        System.out.println("-----------clientService-----------");
    }

    public static ClientService createInstance() {
        return clientService;
    }
}
