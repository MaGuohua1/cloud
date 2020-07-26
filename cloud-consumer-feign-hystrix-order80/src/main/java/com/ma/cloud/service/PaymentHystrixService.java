package com.ma.cloud.service;

import com.ma.cloud.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.service.PaymentHystrixService
 * @description DOTO
 * @since 2020/7/4 12:03
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {
    @GetMapping("/payment/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") int id);

    @GetMapping("/payment/timeout/{id}")
    String paymentInfo_Timeout(@PathVariable("id") int id);
}
