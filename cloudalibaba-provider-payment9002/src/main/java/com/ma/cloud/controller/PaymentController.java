package com.ma.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.controller.PaymentController
 * @description DOTO
 * @since 2020/7/15 11:33
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") int id) {
        return "nacos registry, serverPort: " + port + "\t id" + id;
    }
}
