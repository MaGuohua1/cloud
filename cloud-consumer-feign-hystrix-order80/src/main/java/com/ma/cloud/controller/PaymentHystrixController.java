package com.ma.cloud.controller;

import com.ma.cloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.controller.PaymentHystrixController
 * @description DOTO
 * @since 2020/7/4 12:03
 */
@RestController
@RequestMapping("/consumer/hystrix")
//@DefaultProperties(defaultFallback = "payment_Global_FallbackMathod")
public class PaymentHystrixController {

    @Resource
    private PaymentHystrixService service;

    @GetMapping("/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") int id) {
        return service.paymentInfo_OK(id);
    }

    @GetMapping("/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentTimeoutFallMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })
//    @HystrixCommand
    public String paymentInfo_Timeout(@PathVariable("id") int id) {
//        int i = 1 / 0;
        return service.paymentInfo_Timeout(id);
    }

    public String paymentTimeoutFallMethod(@PathVariable("id") int id) {
        return "我是消费者80，对方支付系统繁忙请10秒后再试";
    }

    //下面是全局fallback方法
    public String payment_Global_FallbackMathod() {
        return "Global异常处理信息，请稍后再试";
    }
}
