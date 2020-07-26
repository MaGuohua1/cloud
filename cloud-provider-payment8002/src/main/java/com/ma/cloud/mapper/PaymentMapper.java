package com.ma.cloud.mapper;

import com.ma.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Class com.ma.cloud.dao.PaymentDao
 * @Description DOTO
 * @Author MaGuohua
 * @Create 2020/6/24 9:56
 * @Version v1.0
 */
@Mapper
public interface PaymentMapper {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
