package com.ma.cloud.service.impl;

import com.ma.cloud.mapper.PaymentMapper;
import com.ma.cloud.entities.Payment;
import com.ma.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Class com.ma.cloud.service.impl.PaymentServiceImpl
 * @Description DOTO
 * @Author MaGuohua
 * @Create 2020/6/24 10:24
 * @Version v1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
