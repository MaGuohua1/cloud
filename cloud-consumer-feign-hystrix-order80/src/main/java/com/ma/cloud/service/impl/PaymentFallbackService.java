package com.ma.cloud.service.impl;

import com.ma.cloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.service.impl.PaymentFallbackService
 * @description DOTO
 * @since 2020/7/5 12:26
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(int id) {
        return "---PaymentFallbackService paymentInfo_OK";
    }

    @Override
    public String paymentInfo_Timeout(int id) {
        return "---PaymentFallbackService paymentInfo_Timeout";
    }
}
