package org.windwant.grpc.server;

import org.windwant.grpc.server.provider.XXXServiceProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @file: GrpcServer
 */
@SpringBootApplication
public class GrpcServer {

    private static final Logger logger = LoggerFactory.getLogger(GrpcServer.class);

    @Bean
    public XXXServiceProvider xxxServiceProvider() {
        return new XXXServiceProvider();
    }

    public static void main(String[] args) {
        System.getProperties().put("server.port", 8081);
        SpringApplication.run(GrpcServer.class, args);
    }
}
