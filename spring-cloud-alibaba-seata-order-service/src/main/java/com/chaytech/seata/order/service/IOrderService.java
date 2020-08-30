package com.chaytech.seata.order.service;

import com.chaytech.seata.order.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 17:17
 */
public interface IOrderService {
    Order getOrderById(Long id);

    void createOrder(Order order);
}
