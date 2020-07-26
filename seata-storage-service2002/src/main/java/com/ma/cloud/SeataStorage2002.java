package com.ma.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.SeataStorage2002
 * @description DOTO
 * @since 2020/7/26 10:04
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class SeataStorage2002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataStorage2002.class, args);
    }
}
