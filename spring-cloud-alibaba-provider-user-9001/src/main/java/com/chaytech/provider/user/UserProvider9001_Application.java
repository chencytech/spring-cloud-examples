package com.chaytech.provider.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 20:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserProvider9001_Application {

    public static void main(String[] args) {
        SpringApplication.run(UserProvider9001_Application.class,args);
    }
}
