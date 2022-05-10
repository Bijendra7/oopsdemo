package com.wipro.velocity.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student a = (Student)context.getBean("student");
		
		System.out.println(a.getName());
	}

}
