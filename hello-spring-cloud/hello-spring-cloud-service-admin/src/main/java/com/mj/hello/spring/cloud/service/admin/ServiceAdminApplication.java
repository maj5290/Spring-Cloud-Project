package com.mj.hello.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 通过@EnableEurekaClient表明自己是一个Eureka Client
 * 客户端要注册到服务端上去
 */
@SpringBootApplication  //springboot启动必备
@EnableEurekaClient
public class ServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class,args);
    }
}
