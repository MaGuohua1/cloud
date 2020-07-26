package com.ma.cloud.service;

import com.ma.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Class com.ma.cloud.service.PaymentService
 * @Description DOTO
 * @Author MaGuohua
 * @Create 2020/6/24 10:23
 * @Version v1.0
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
