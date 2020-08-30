package com.chaytech.seata.account.service;

import com.chaytech.seata.account.domain.Account;

import java.math.BigDecimal;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 20:43
 */
public interface IAccountService {

    void createAccount(Account account);

    void decrease(Long userId, BigDecimal amount);
}
