package com.mj.hello.spring.cloud.service.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced       //表示我这个服务要去访问负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
