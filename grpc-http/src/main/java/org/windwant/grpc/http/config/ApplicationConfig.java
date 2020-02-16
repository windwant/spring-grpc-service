package org.windwant.grpc.http.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public FastJsonHttpMessageConverter fastJsonHttpMessageConverter(){
        return new FastJsonHttpMessageConverter();
    }
}
