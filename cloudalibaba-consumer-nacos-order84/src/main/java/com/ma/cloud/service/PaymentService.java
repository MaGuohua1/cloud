package com.ma.cloud.service;

import com.ma.cloud.entities.CommonResult;
import com.ma.cloud.entities.Payment;
import com.ma.cloud.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.service.PaymentService
 * @description DOTO
 * @since 2020/7/22 11:02
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
