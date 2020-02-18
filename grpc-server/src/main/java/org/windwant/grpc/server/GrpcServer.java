package org.windwant.grpc.server;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.windwant.grpc.server.provider.XXXServiceProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @file: GrpcServer
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"org.windwant.grpc.service"})
public class GrpcServer {

    private static final Logger logger = LoggerFactory.getLogger(GrpcServer.class);

    @Bean
    public XXXServiceProvider xxxServiceProvider() {
        return new XXXServiceProvider();
    }

    public static void main(String[] args) {
        SpringApplication.run(GrpcServer.class, args);
    }
}
