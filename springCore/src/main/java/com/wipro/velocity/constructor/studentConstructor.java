package com.wipro.velocity.constructor;

public class studentConstructor {
	
	private String name;
	private String course;
	private String collage;
	
	public studentConstructor() {
		super();
	}

	public studentConstructor(String name, String course, String collage) {
		super();
		this.name = name;
		this.course = course;
		this.collage = collage;
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Course: "+course);
		System.out.println("Collage: "+collage);
	}

}
