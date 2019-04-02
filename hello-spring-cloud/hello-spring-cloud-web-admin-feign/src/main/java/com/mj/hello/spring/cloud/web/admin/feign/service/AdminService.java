package com.mj.hello.spring.cloud.web.admin.feign.service;

import com.mj.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    //这里的value="hi"是service-admin 提供的那个名称
    //这里的@RequestParam一定要写的，不然会报405的错
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam("message") String message);

}
