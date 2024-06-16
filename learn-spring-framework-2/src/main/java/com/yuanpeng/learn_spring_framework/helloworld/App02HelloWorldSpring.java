package com.yuanpeng.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //Creating a Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("person3Parameters"));

        System.out.println(context.getBean("person4Parameters"));

        System.out.println(context.getBean("person5Qualifier"));

        System.out.println(context.getBean(Address.class));
    }
}
