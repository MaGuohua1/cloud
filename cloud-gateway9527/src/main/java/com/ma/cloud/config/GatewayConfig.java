package com.ma.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.config.GatewayConfig
 * @description DOTO
 * @since 2020/7/9 13:05
 */
@Configuration
public class GatewayConfig {
    /**
     * @description 配置一个id为route-name的路由规则
     * 当访问地址http://localhost:9527/guonei时会自动转发到地址：http://news.baidu.com/guonei
     * @params builder:
     * @return org.springframework.cloud.gateway.route.RouteLocator
     * @author MaGuohua
     * @date 2020年07月09日 13:16
     */
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("circuitbreaker_route", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
    }
}
