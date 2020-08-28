package com.chaytech.sentinel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * 自定义限流异常处理类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/28 21:16
 */
public class CustomerBlockHandler {

    public String cusBlockHandler (String p1, String p2, BlockException exception){
        return "testHotKey blockHandler";
    }

}
