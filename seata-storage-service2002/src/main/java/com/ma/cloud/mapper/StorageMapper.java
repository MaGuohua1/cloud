package com.ma.cloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.mapper.StorageMapper
 * @description DOTO
 * @since 2020/7/26 10:08
 */
@Mapper
public interface StorageMapper {
    //扣减库存信息
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}