package com.ma.cloud.service;

import com.ma.cloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.service.StorageService
 * @description DOTO
 * @since 2020/7/25 12:14
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}