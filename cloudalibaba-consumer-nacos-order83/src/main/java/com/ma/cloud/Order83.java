package com.ma.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.Order83
 * @description DOTO
 * @since 2020/7/15 11:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Order83 {
    public static void main(String[] args) {
        SpringApplication.run(Order83.class, args);
    }
}
