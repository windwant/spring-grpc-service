package org.windwant.grpc.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * RelationHttpServer
 */
@SpringBootApplication
@RestController
@ComponentScan({"org.windwant.grpc"})
public class GrpcHttpServer {
    private static final Logger logger = LoggerFactory.getLogger(GrpcHttpServer.class);

    public static void main(String[] args) {
        SpringApplication.run(GrpcHttpServer.class, args);
    }
}
