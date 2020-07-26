package com.ma.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Class com.ma.cloud.Payment8002
 * @Description DOTO
 * @Author MaGuohua
 * @Create 2020/6/24 9:16
 * @Version v1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Payment8002 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8002.class, args);
    }
}
