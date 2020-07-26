package com.ma.cloud.controller;

import com.ma.cloud.entities.CommonResult;
import com.ma.cloud.entities.Payment;
import com.ma.cloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.controller.OrderController
 * @description DOTO
 * @since 2020/7/3 12:00
 */
@RestController
@RequestMapping(value = "/consumer/order", produces = { "application/json; charset=UTF-8" })
public class OrderController {

    @Resource
    private PaymentFeignService feignService;

    @PostMapping("/create")
    public CommonResult<Integer> create(Payment payment) {
        return feignService.create(payment);
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return feignService.getPaymentById(id);
    }

    @GetMapping("/feign/timeout")
    public String paymentFeignTimeout() {
        return feignService.paymentFeignTimeout();
    }
}
