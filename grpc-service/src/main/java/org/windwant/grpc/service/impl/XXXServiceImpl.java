package org.windwant.grpc.service.impl;

import org.springframework.stereotype.Service;
import org.windwant.grpc.service.XXXService;

@Service
public class XXXServiceImpl implements XXXService {
    @Override
    public String hello(String name) {
        return "HELLO: " + name;
    }
}
