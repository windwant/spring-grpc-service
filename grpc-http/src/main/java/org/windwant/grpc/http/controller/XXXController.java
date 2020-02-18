package org.windwant.grpc.http.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.windwant.grpc.client.consumer.XXXServiceGrpcConsumer;
import org.windwant.grpc.service.XXXService;

import javax.annotation.Resource;

@RestController
public class XXXController {

    @Resource
    private XXXService xxxService;

    @Autowired
    XXXServiceGrpcConsumer consumer;

    @RequestMapping(value = "/hello.json", method = RequestMethod.GET)
    public String show(@RequestParam(value = "name") String name)  {

        return xxxService.hello(name);
    }

    @RequestMapping(value = "/hellox.json", method = RequestMethod.GET)
    public String showx(@RequestParam(value = "name") String name)  {
        return consumer.hello(name).getResult();
    }
}
