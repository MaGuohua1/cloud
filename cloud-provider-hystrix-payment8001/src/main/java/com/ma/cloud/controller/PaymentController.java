package com.ma.cloud.controller;

import com.ma.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.controller.PaymentController
 * @description DOTO
 * @since 2020/7/4 10:24
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @GetMapping("/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") int id) {
        return service.paymentInfo_OK(id);
    }

    @GetMapping("/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") int id) {
        return service.paymentInfo_Timeout(id);
    }

    @GetMapping("/curcuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") int id) {
        return service.paymentCircuitBreaker(id);
    }
}
