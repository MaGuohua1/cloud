package com.ma.cloud.domain;

import lombok.Data;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.domain.Storage
 * @description DOTO
 * @since 2020/7/26 10:06
 */
@Data
public class Storage {
    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;

    //已用库存
    private Integer used;

    //剩余库存
    private Integer residue;
}
