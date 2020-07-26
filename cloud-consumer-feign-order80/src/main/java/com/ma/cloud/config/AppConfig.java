package com.ma.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.config.AppConfig
 * @description DOTO
 * @since 2020/7/3 14:28
 */
@Configuration
public class AppConfig {

    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
    }
}
