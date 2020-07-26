package com.ma.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.config.MyBatisConfig
 * @description DOTO
 * @since 2020/7/26 9:29
 */
@Configuration
@MapperScan("com.ma.cloud.mapper")
public class MyBatisConfig {
}
