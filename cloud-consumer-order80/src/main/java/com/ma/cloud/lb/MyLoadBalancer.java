package com.ma.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.lb.MyLoadBalancer
 * @description DOTO
 * @since 2020/7/2 11:31
 */
@Component
public class MyLoadBalancer implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        if (serviceInstances == null || serviceInstances.size() == 0) {
            return null;
        }
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = atomicInteger.get();
            next = current < Integer.MAX_VALUE ? current + 1 : 0;
        } while (!atomicInteger.compareAndSet(current,next));
        return next;
    }
}
