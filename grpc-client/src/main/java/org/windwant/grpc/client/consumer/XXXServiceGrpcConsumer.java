package org.windwant.grpc.client.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.windwant.grpc.proto.Common;
import org.windwant.grpc.proto.XXXServiceGrpc;

import javax.annotation.Resource;

@Component
public class XXXServiceGrpcConsumer {
    private static final Logger logger = LoggerFactory.getLogger(XXXServiceGrpcConsumer.class);

    @Resource
    private XXXServiceGrpc.XXXServiceBlockingStub xxxServiceBlockingStub;

    public Common.CommonResponse hello(String name) {
        return xxxServiceBlockingStub.hello(org.windwant.grpc.proto.Common.CommonRequest.newBuilder().setName(name).build());
    }
}
