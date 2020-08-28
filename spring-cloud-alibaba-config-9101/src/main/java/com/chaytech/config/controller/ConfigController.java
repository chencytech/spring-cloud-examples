package com.chaytech.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/06 21:07
 */
@RestController
@RequestMapping("/config")
@RefreshScope // 实现配置自动更新
public class ConfigController {

    @Value("${config.content:defaultContent}")
    private String configContent;

    @GetMapping("/get")
    public String getConfigContent(){
        return configContent;
    }
}
