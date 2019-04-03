package com.mj.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.mj.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * Hystrix �࣬�ڷ����������������ԭ����ɷ����޷���������ʱ
 * Ϊ��ֹ��ɷ���ѩ��
 */
@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return String.format("Hi your message is :%s but request bad",message);
    }
}
