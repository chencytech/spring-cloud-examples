package com.chaytech.seata.account.dao;

import com.chaytech.seata.account.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 20:47
 */
@Mapper
public interface AccountDao {

    Account getAccountByUserId(Long userId);

    void createAccount(Account account);

    int decrease(@Param("userId") Long userId, @Param("amount") BigDecimal amount);
}
