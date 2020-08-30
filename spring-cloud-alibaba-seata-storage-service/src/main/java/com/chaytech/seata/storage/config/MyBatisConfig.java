package com.chaytech.seata.storage.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 18:10
 */
@Configuration
@MapperScan({"com.chaytech.seata.order.dao"})
public class MyBatisConfig {

}
