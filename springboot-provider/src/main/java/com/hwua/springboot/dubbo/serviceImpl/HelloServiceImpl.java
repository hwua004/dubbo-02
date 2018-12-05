package com.hwua.springboot.dubbo.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hwua.dubbo.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        System.out.println("springboot-dubbo:服务被调用了");
        return "Hello,"+name+",I am springoot";
    }
}
