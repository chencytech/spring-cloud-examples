package com.chaytech.seata.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 16:59
 */
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.chaytech.api.seata"})
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) // 取消数据源的自动创建使用seata对数据源进行代理
public class SeataOrder9011_Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrder9011_Application.class,args);
    }
}
