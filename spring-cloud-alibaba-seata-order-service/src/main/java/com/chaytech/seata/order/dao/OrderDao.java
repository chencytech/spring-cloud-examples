package com.chaytech.seata.order.dao;

import com.chaytech.seata.order.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 17:03
 */
@Mapper
public interface OrderDao {

    Order getOrderById(Long id);

    void createOrder(Order order);

    int updateOrderStatus(@Param("id") Long id,@Param("status")  Integer status);
}
