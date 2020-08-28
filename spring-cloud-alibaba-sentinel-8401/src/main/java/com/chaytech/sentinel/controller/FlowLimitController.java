package com.chaytech.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.chaytech.sentinel.handler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/16 11:22
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "test A ..";
    }

    @GetMapping("/testB")
    public String testB(){
        return "test B ..";
    }

    @GetMapping("testRt")
    public String testRt(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testRt");
        return "testRt";
    }

    @GetMapping("/testRatio")
    public String testRation(){
        int i = 10/0;
        return "testRatio";
    }

    @GetMapping("/testExceptionCount")
    public String testExceptionCount(){
        int i = 10/0;
        return "testExceptionCount";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "cusBlockHandler")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {

        return "testHotKey";
    }


}
