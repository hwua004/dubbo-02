package com.hwua;

import com.hwua.dubbo.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Consumer {
    public static void main( String[] args ){
        ClassPathXmlApplicationContext app=
                new ClassPathXmlApplicationContext("consumer.xml");
        HelloService service=app.getBean(HelloService.class);
        String str=service.sayHello("Tom");
        System.out.println(str);
    }
}
