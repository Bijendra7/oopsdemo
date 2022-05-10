package com.wipro.velocity.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext a = new ClassPathXmlApplicationContext("config.xml");
		Student1 student = (Student1)a.getBean("Student1");
		System.out.println("Student name: "+student.getFirstName()+" "+student.getLastName());
		System.out.println("Father name: "+student.getFatherName());
		System.out.println("Roll Number: "+student.getRollNo());
		System.out.println("Phone Number: "+student.getPhoneNumber());

	}

}
