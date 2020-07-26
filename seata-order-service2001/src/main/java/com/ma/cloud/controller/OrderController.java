package com.ma.cloud.controller;

import com.ma.cloud.domain.CommonResult;
import com.ma.cloud.domain.Order;
import com.ma.cloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.controller.OrderController
 * @description DOTO
 * @since 2020/7/25 12:38
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

}
