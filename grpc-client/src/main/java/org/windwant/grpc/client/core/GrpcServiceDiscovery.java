package org.windwant.grpc.client.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class GrpcServiceDiscovery {

    @Autowired
    DiscoveryClient discoveryClient;

    public ServiceInstance getService() {
        List<ServiceInstance> instanceList = discoveryClient.getInstances("grpc-server");

        if (instanceList.isEmpty()) {
            return null;
        }

        return  instanceList.get(ThreadLocalRandom.current().nextInt(instanceList.size()));
    }
}