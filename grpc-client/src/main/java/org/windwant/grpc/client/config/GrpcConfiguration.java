package org.windwant.grpc.client.config;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.windwant.grpc.client.core.GrpcServiceDiscovery;
import org.windwant.grpc.proto.XXXServiceGrpc;

@Configuration
public class GrpcConfiguration {

    @Bean
    public XXXServiceGrpc.XXXServiceBlockingStub xxxServiceBlockingStub(Channel channel) {
        return XXXServiceGrpc.newBlockingStub(channel);
    }

    @Autowired
    GrpcServiceDiscovery grpcServiceDiscovery;

    @Bean
    public ManagedChannel channel() {
        ServiceInstance service = grpcServiceDiscovery.getService();
        if (service != null) {
            return ManagedChannelBuilder.forAddress(service.getHost(), service.getPort()).usePlaintext().build();

        }
        return null;
    }
}
