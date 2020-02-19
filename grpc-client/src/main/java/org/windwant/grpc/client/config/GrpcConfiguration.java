package org.windwant.grpc.client.config;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.windwant.grpc.client.GrpcConstant;
import org.windwant.grpc.client.core.GrpcServiceDiscovery;
import org.windwant.grpc.proto.XXXServiceGrpc;

/**
 * rpc client config
 *
 */
@Configuration
public class GrpcConfiguration {

    //rpc stub
    @Bean
    public XXXServiceGrpc.XXXServiceBlockingStub xxxServiceBlockingStub(@Qualifier(value = "xxchannel") Channel channel) {
        return XXXServiceGrpc.newBlockingStub(channel);
    }

    @Autowired
    GrpcServiceDiscovery grpcServiceDiscovery;

    // xxService server channel
    @Bean(name = "xxchannel")
    public ManagedChannel channel() {
        //get random service from zookeeper
        ServiceInstance service = grpcServiceDiscovery.getService(GrpcConstant.GRPC_SERVICE_XX);
        if (service != null) {
            //build channel
            return ManagedChannelBuilder.forAddress(service.getHost(), service.getPort()).usePlaintext().build();

        }
        return null;
    }
}
