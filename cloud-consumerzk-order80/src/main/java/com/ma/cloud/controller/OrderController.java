package com.ma.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.controller.OrderController
 * @description DOTO
 * @since 2020/7/1 8:59
 */
@RestController
@RequestMapping("/consumer/order")
public class OrderController {

    public static final String INVOKE_URL = "http://cloud-payment_services/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/zk")
    public String payment() {
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }
}
