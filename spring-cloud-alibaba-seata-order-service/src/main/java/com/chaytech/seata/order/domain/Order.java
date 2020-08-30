package com.chaytech.seata.order.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 17:01
 */
@Data
public class Order {
    private Long id;
    private Long userId; // 用户id
    private Long productId; // 产品id
    private Integer count; // 数量
    private BigDecimal money; // 金额
    private Integer status; // 订单状态：0：创建中；1：已完结
}
