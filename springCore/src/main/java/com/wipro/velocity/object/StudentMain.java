package com.wipro.velocity.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext student = new ClassPathXmlApplicationContext("config.xml");
		Student s = (Student)student.getBean("Student2");
		System.out.println("Name: "+s.getFirstName()+" "+s.getLastName());
		System.out.println("Roll number: "+s.getRollnumber());
		System.out.println("Address is :");
		System.out.println("City: "+s.getAddress().getCity());
		System.out.println("State: "+s.getAddress().getState());
		System.out.println("Country: "+s.getAddress().getCountry());
		
	}
}
