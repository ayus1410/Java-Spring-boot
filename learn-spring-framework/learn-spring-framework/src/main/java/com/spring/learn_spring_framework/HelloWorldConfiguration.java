package com.spring.learn_spring_framework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor
// equals, hashcode and to String are automatically created
// Released in JKD 16

@Configuration // Configure the Spring Beans
public class HelloWorldConfiguration {

	@Bean
	public Address address() {
		return new Address("Hinjewadi", "Pune");
	}

	@Bean
	public int age() {
		return 15;
	}

	@Bean
	public String name() {
		return "Ayush";
	}

	@Bean
	@Primary // to give the priority to a specific bean if there are several of that type.
	@Qualifier("personQualifier")
	public Person person() {
		return new Person("Aman", 20);
	}

	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age());
	}

	@Bean
	public Person person3parameters(String name, int age) {
		return new Person(name, age);
	}
};

record Person(String name, int age) {
}

record Address(String firstLine, String city) {
}
