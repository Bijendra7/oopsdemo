package com.wipro.velocity.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentSetMain {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	studentSet s = (studentSet)context.getBean("set");
	for(String student : s.getSet())
	{
		System.out.println(student);
	}
}
}
