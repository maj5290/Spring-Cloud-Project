package com.mj.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.mj.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * Hystrix 类，在服务出现阻塞或其他原因造成服务无法正常运行时
 * 为防止造成服务雪崩
 */
@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return String.format("Hi your message is :%s but request bad",message);
    }
}
