package com.wipro.velocity.student;

public class Student1 {
	
	private String firstName;
	private String lastName;
	private String fatherName;
	private int rollNo;
	private String phoneNumber;
	
	public Student1() {
		super();
		}

	public Student1(String firstName, String lastName, String fatherName, int rollNo, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.rollNo = rollNo;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
