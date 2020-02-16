package org.windwant.grpc.server.service.impl;

import org.springframework.stereotype.Service;
import org.windwant.grpc.server.service.XXXService;

@Service
public class XXXServiceImpl implements XXXService {
    @Override
    public String hello(String name) {
        return "HELLO: " + name;
    }
}
