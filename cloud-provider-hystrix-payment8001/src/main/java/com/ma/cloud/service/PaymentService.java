package com.ma.cloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.service.PaymentService
 * @description DOTO
 * @since 2020/7/4 10:12
 */
public interface PaymentService {
    String paymentInfo_OK(int id);
    String paymentInfo_Timeout(int id);
    String paymentCircuitBreaker(int id);
}
