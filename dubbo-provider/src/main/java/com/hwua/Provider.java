package com.hwua;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Provider{
    public static void main( String[] args )throws Exception{
        ClassPathXmlApplicationContext app=
                new ClassPathXmlApplicationContext("provider.xml");
        app.start();

        System.in.read();
    }
}
