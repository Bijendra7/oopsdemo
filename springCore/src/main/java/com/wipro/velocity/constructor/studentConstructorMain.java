package com.wipro.velocity.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentConstructorMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		studentConstructor c = (studentConstructor)context.getBean("constructor");
		c.display();

	}

}
