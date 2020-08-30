package com.chaytech.seata.account.service.impl;

import com.chaytech.seata.account.dao.AccountDao;
import com.chaytech.seata.account.domain.Account;
import com.chaytech.seata.account.service.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 20:43
 */
@Service
public class AccountServiceImpl implements IAccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private AccountDao accountDao;

    @Override
    public void createAccount(Account account) {
        accountDao.createAccount(account);
    }

    @Override
    public void decrease(Long userId, BigDecimal amount) {
        int num = accountDao.decrease(userId, amount);
        if (num == 0) {
            throw new RuntimeException("余额不足");
        }
    }
}
