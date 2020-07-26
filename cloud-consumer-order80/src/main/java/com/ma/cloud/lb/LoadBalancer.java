package com.ma.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.lb.LoadBalancer
 * @description DOTO
 * @since 2020/7/2 11:29
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
