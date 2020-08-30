package com.chaytech.seata.storage.service.impl;

import com.chaytech.seata.storage.dao.StorageDao;
import com.chaytech.seata.storage.domain.Storage;
import com.chaytech.seata.storage.service.IStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 21:21
 */
@Service
public class StorageServiceImpl implements IStorageService {

    @Autowired
    private StorageDao storageDao;

    @Override
    public Storage getStorageByProductId(Long productId) {
        return storageDao.getStorageByProductId(productId);
    }

    @Override
    public void createStorage(Storage storage) {
        storageDao.createStorage(storage);
    }

    @Override
    public void decrease(Long productId, Integer count) {
        int num = storageDao.decrease(productId, count);
        if (num == 0) {
            throw new RuntimeException("库存不足");
        }
    }
}
