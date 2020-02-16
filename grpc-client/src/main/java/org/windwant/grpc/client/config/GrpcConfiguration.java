package org.windwant.grpc.client.config;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.windwant.grpc.proto.XXXServiceGrpc;

@Configuration
@ComponentScan(basePackages = "org.windwant.grpc.client.consumer")
public class GrpcConfiguration {

    @Bean
    public XXXServiceGrpc.XXXServiceBlockingStub ucRelationQueryblockingStub(Channel channel) {
        return XXXServiceGrpc.newBlockingStub(channel);
    }

    @Bean
    public ManagedChannel channel() {
        return ManagedChannelBuilder.forAddress("127.0.0.1", 6568).usePlaintext().build();
    }
}
