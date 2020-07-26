package com.ma.cloud.service;

import com.ma.cloud.mapper.StorageMapper;

import javax.annotation.Resource;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.service.StorageService
 * @description DOTO
 * @since 2020/7/26 10:29
 */
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);
}