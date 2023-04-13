package com.practice.som.SpringFramework.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// record was introduced in Java16 
// Eliminating verbosity in creating Java Beans public accessor methods, 
// constructor, hashcode and toString are automatically created

record Person(String name, int age) { };
record Person1(String name, int age, Address address) { };
record Address(String firstLine, String city) { };

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Som";
	}
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	public Person person() {
		return new Person("Sam",18);
	}
	
	@Bean
	public Person1 person1() {
		return new Person1("Sam",18,new Address("Northern Avenue","Kolkata"));
	}
	
	
	@Bean
	public Person personMethodCall() {
		return new Person(name(),age());
	}
	
	@Bean
	public Person1 personMethodCall1() {
		return new Person1(name(),age(),address());
	}
	
	@Bean
	public Person1 personWithParameters(String name, int age, Address address2) {
		return new Person1(name,age,address2);
	}
	
	@Bean
	public Address address() {
		return new Address("Dacres Lane","Kolkata");
	}
	
	@Bean (name = "newaddress")
	public Address address1() {
		return new Address("Zakaria Street","Kolkata");
	}
	
	@Bean
	public Address address2() {
		return new Address("Raja Manindra Road","Kolkata");
	}
}
