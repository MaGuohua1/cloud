package com.ma.cloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.ma.cloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.service.impl.PaymentServiceImpl
 * @description DOTO
 * @since 2020/7/4 10:14
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentInfo_OK(int id) {
        return "线程池：[" + Thread.currentThread().getName() + "],method：paymentInfo_OK, id：" + id;
    }

    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_Timeout(int id) {
        int time = 5;
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：[" + Thread.currentThread().getName() + "],method：paymentInfo_Timeout, id：" + id + ",耗时：" + time + "秒";
    }

    public String paymentInfo_TimeoutHandler(@PathVariable("id") int id) {
        return "线程池：[" + Thread.currentThread().getName() + "], 系统繁忙，请稍后再试, id：" + id;
    }

    //====服务熔断
    //HystrixPropertiesManager
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),  //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), //请求次数,超过峰值时，熔断器会从关闭状态变为开启
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),   //时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")    //失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") int id) {
        if (id < 0) {
            throw new RuntimeException("****不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t调用成功，流水号：" + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id") int id) {
        return "id 不能为负数，请稍后再试，id：" + id;
    }
}