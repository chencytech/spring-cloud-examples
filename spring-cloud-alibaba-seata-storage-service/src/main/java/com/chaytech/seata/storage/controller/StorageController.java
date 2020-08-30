package com.chaytech.seata.storage.controller;

import com.chaytech.api.common.ApiResult;
import com.chaytech.seata.storage.domain.Storage;
import com.chaytech.seata.storage.service.IStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 21:22
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private IStorageService storageService;

    @PostMapping("/createStorage")
    public ApiResult createStorage(Storage storage){
        storageService.createStorage(storage);
        return new ApiResult(200,"产品创建成功");
    }

    @PostMapping("/decrease")
    public ApiResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        storageService.decrease(productId, count);
        return new ApiResult(200, "扣减库存成功");
    }
}
