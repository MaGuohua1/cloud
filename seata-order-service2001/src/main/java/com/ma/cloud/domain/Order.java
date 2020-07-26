package com.ma.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.domain.Order
 * @description DOTO
 * @since 2020/7/25 12:02
 */
@Data
public class Order {
    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    private Integer status; //订单状态：0：创建中；1：已完结
}
