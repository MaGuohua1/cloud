package com.ma.cloud.mapper;

import com.ma.cloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.mapper.OrderMapper
 * @description DOTO
 * @since 2020/7/25 12:04
 */
@Mapper
public interface OrderMapper {
    //新建订单
    void create(Order order);

    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
