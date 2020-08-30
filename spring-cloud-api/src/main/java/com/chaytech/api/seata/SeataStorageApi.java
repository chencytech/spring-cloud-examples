package com.chaytech.api.seata;

import com.chaytech.api.common.ApiResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 17:27
 */
@Component
@FeignClient(value = "seata-storage-service")
public interface SeataStorageApi {

    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     * @return
     */
    @PostMapping("/storage/decrease")
    ApiResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
