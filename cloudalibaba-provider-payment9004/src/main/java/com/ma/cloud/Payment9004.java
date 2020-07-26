package com.ma.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.Payment9004
 * @description DOTO
 * @since 2020/7/22 8:56
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9004 {
    public static void main(String[] args) {
        SpringApplication.run(Payment9004.class, args);
    }
}
