package com.practice.som.SpringFramework.basics;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("address"));
			
			//System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("newaddress"));
			
			System.out.println(context.getBean("personMethodCall"));
			
			System.out.println(context.getBean("personWithParameters"));
			
			System.out.println(context.getBean("person1"));
			
			System.out.println(context.getBean("personMethodCall1"));
			
		} catch (BeansException e) {
			
			e.printStackTrace();
		}
		
	}

}
