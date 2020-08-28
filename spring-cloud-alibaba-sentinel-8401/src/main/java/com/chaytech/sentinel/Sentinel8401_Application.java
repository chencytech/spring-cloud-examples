package com.chaytech.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/16 11:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Sentinel8401_Application {

    public static void main(String[] args) {
        SpringApplication.run(Sentinel8401_Application.class, args);
    }
}
