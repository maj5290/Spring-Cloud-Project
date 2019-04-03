package com.mj.hello.spring.cloud.service.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon + RestTimplate 组合，调用服务提供者的接口
 * 写法如下：在ribbon中的实现类中，通过restTemplate.getForObject("http://服务名/url"，类型),很麻烦
 * @HystrixCommand 是Hystrix 在ribbon 中的用法，不需要像feign写个类，只需要在这个实现类中写个方法即可；
 * ribbon 没有自带Hystrix，所以需要增加依赖
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "hiError") //连不上就返回下面hiError的方法
    public String sayHi(String message){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message="+message,String.class);
    }

    //熔断方法
    public String hiError(String message){
        return String.format("Hi your message is :%s but request bad",message);
    }



}
