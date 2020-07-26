package com.ma.cloud.service;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.service.AccountService
 * @description DOTO
 * @since 2020/7/26 11:16
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}