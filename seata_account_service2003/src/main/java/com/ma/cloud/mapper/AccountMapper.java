package com.ma.cloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.mapper.AccountMapper
 * @description DOTO
 * @since 2020/7/26 11:02
 */
@Mapper
public interface AccountMapper {
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
