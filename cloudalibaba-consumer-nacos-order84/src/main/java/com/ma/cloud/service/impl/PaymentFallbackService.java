package com.ma.cloud.service.impl;

import com.ma.cloud.entities.CommonResult;
import com.ma.cloud.entities.Payment;
import com.ma.cloud.service.PaymentService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.service.impl.PaymentFallbackService
 * @description DOTO
 * @since 2020/7/22 11:05
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}