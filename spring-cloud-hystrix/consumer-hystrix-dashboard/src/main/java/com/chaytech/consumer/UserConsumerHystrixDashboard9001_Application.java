package com.chaytech.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 20:58
 */
@SpringBootApplication
// 本服务启动后会自动注册进eureka服务中
//@EnableEurekaClient
//@EnableFeignClients(basePackages ={"com.chaytech.**"} )
//@ComponentScan(basePackages = {"com.chaytech.**"})
//@EnableHystrix // 开启hysterix
//@EnableHystrixDashboard // 开启hysterix监控
public class UserConsumerHystrixDashboard9001_Application {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerHystrixDashboard9001_Application.class,args);
    }
}
