package com.ma.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.Eureka7002
 * @description DOTO
 * @since 2020/6/28 9:27
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002.class, args);
    }
}
