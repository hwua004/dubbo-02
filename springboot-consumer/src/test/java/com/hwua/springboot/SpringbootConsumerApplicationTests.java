package com.hwua.springboot;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hwua.dubbo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConsumerApplicationTests {
    @Reference
    private HelloService helloService;

    @Test
    public void contextLoads() {
        String str=helloService.sayHello("Peter");
        System.out.println(str);
    }

}
