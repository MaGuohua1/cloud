package com.ma.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.Payment9002
 * @description DOTO
 * @since 2020/7/15 11:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9002 {
    public static void main(String[] args) {
        SpringApplication.run(Payment9002.class, args);
    }
}
