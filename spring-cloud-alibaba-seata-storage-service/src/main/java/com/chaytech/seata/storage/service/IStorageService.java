package com.chaytech.seata.storage.service;

import com.chaytech.seata.storage.domain.Storage;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 21:19
 */
public interface IStorageService {

    Storage getStorageByProductId(Long productId);

    void createStorage(Storage storage);

    void decrease(Long productId, Integer count);
}
