package com.mj.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminControllser {

    //这个在使用的时候可以自动注入我这个端口号，从application.yml获得
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(String message){
        // %s 是一个占位符
        return String.format("Hi your message is: %s port: %s",message,port);
    }
}
