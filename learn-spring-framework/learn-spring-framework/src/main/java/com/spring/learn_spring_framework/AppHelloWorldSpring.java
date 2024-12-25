package com.spring.learn_spring_framework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {
	public static void main(String[] args) {

		// 1: Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// 2: Configure the things that we want Spring to manage
		// HelloWorldConfiguartion - @Configuration
		// name - @bean
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3parameters"));
		System.out.println(context.getBean(Address.class));
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
