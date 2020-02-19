package org.windwant.grpc.server.provider;

import io.grpc.stub.StreamObserver;
import org.windwant.grpc.proto.Common;
import org.windwant.grpc.proto.XXXServiceGrpc;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.windwant.grpc.service.XXXService;

/**
 *  Marks the annotated class to be registered as grpc-service bean
 *
 *  XXXServiceGrpc.XXXServiceImplBase: protobuf service definition
 *
 */
@GRpcService
public class XXXServiceProvider extends XXXServiceGrpc.XXXServiceImplBase {
    private static final Logger logger = LoggerFactory.getLogger(XXXServiceProvider.class);

    @Autowired
    XXXService xxxService;

    @Override
    public void hello(Common.CommonRequest request, StreamObserver<Common.CommonResponse> responseObserver) {
        //call service
        String result = xxxService.hello(request.getName());

        //process response Message
        Common.CommonResponse response = Common.CommonResponse.newBuilder().setResult(result).build();

        //Receives a value from the stream
        responseObserver.onNext(response);

        //Receives a notification of successful stream completion.
        responseObserver.onCompleted();
    }
}
