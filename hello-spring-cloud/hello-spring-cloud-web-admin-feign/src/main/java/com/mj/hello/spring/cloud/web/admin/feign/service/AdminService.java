package com.mj.hello.spring.cloud.web.admin.feign.service;

import com.mj.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 这是feign消费者的接口（注意区别ribbon的用法,其实feign集成了ribbon，feign还自带Hystrix）
 * 通过@FeignClient去调用名为hello-spring-cloud-service-admin服务的接口
 * fallback是为了避免由阻塞或其他原因造成的服务雪崩
 * 下面是调用了服务提供者url为 hi 的接口
 * 再其他的方法里调用就可以了
 */
@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    //这里的value="hi"是service-admin 提供的那个名称
    //这里的@RequestParam一定要写的，不然会报405的错
    //调用别的服务的接口，参数肯定要一样哟
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam("message") String message);

}
