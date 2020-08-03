package com.chaytech.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/07/20 21:28
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayServer9527_Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServer9527_Application.class);
    }
}
