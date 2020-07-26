package com.ma.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Class com.ma.cloud.config.AppConfig
 * @Description DOTO
 * @Author MaGuohua
 * @Create 2020/6/25 9:28
 * @Version v1.0
 */
@Configuration
public class AppConfig {

    @Bean
//    @LoadBalanced   //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
