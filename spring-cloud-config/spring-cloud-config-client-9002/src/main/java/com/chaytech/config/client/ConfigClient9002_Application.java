package com.chaytech.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/07/28 7:42
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient9002_Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient9002_Application.class,args);
    }
}
