package com.ma.cloud.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.domain.Account
 * @description DOTO
 * @since 2020/7/26 10:56
 */
@Data
public class Account {
    private Long id;

    //用户id
    private Long userId;

    //总金额
    private BigDecimal total;

    //以用金额
    private BigDecimal used;

    //剩余金额
    private BigDecimal residue;
}
