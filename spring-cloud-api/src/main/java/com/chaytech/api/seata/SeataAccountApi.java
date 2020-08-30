package com.chaytech.api.seata;

import com.chaytech.api.common.ApiResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 17:27
 */
@Component
@FeignClient(value = "seata-account-service")
public interface SeataAccountApi {

    @PostMapping("/account/decrease")
    ApiResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
