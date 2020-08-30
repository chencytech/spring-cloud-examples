package com.chaytech.seata.storage.dao;

import com.chaytech.seata.storage.domain.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 21:12
 */
@Mapper
public interface StorageDao {

    Storage getStorageByProductId(Long productId);

    void createStorage(Storage storage);

    int decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
