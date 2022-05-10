package com.wipro.velocity.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentMapMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		studentMap map1 = (studentMap) context.getBean("map");
		System.out.println(map1.getStudent());
	}

}
