package com.mj.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 通过@EnableFeignClients注解开启Feign功能
 * 通过@EnableDiscoveryClient去寻找eureka
 * 与ribbon不同的是,ribbon只有@EnableDiscoveryClient
 */
@EnableHystrixDashboard             //开启熔断仪表盘
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class WebAdminFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class,args);
    }

}
