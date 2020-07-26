package com.ma.cloud.service;

import com.ma.cloud.entities.CommonResult;
import com.ma.cloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.service.PaymentService
 * @description DOTO
 * @since 2020/7/3 11:44
 */
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
@RequestMapping("/payment")
public interface PaymentFeignService {

    @PostMapping("/create")
    CommonResult<Integer> create(Payment payment);

    @GetMapping("/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/feign/timeout")
    String paymentFeignTimeout();
}
