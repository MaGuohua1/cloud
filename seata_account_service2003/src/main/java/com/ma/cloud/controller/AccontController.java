package com.ma.cloud.controller;

import com.ma.cloud.domain.CommonResult;
import com.ma.cloud.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.controller.AccontController
 * @description DOTO
 * @since 2020/7/26 11:22
 */
@RestController
public class AccontController {
    @Resource
    private AccountService service;

    @PostMapping(value = "/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money) {
        service.decrease(userId,money);
        return new CommonResult(200, "扣减账户余额成功！");
    }
}
