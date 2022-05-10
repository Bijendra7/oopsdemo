package com.wipro.velocity.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentListMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		studentList list = (studentList)context.getBean("collection");
		for(String name: list.getStudentName())
		{
			System.out.println(name);
		}
	}
}
