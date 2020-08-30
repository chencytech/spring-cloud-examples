package com.chaytech.seata.account.controller;

import com.chaytech.api.common.ApiResult;
import com.chaytech.seata.account.domain.Account;
import com.chaytech.seata.account.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 21:02
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @PostMapping("/createAccount")
    public ApiResult createAccount(Account account){
        accountService.createAccount(account);
        return new ApiResult(200,"账户创建成功");
    }

    @PostMapping("/decrease")
    public ApiResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new ApiResult(200, "扣减账户金额成功");
    }
}
