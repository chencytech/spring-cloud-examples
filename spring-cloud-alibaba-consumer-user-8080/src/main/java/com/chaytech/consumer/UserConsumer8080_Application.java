package com.chaytech.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/06 20:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserConsumer8080_Application {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumer8080_Application.class,args);
    }
}
