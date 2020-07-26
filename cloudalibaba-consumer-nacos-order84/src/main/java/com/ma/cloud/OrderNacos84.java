package com.ma.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.OrderNacos
 * @description DOTO
 * @since 2020/7/22 9:02
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacos84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacos84.class, args);
    }
}
