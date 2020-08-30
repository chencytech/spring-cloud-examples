package com.chaytech.seata.account.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 18:10
 */
@Configuration
@MapperScan({"com.chaytech.seata.account.dao"})
public class MyBatisConfig {

}
