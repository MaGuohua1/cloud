package com.ma.cloud.controller;

import com.ma.cloud.domain.CommonResult;
import com.ma.cloud.service.StorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.controller.StorageController
 * @description DOTO
 * @since 2020/7/26 10:35
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @PostMapping(value = "/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count) {
        storageService.decrease(productId,count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
