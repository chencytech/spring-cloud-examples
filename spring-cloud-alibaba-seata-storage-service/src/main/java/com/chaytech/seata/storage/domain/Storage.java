package com.chaytech.seata.storage.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 21:11
 */
@Data
public class Storage {
    private Long id;
    private Long productId;
    private Integer total;
    private Integer used;
    private Integer residue;
}
