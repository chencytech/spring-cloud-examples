package com.chaytech.seata.order.controller;

import com.chaytech.api.common.ApiResult;
import com.chaytech.seata.order.domain.Order;
import com.chaytech.seata.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 18:07
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping("/create")
    public ApiResult create(Order order) {
        orderService.createOrder(order);
        return new ApiResult(200, "下单成功");
    }
}
