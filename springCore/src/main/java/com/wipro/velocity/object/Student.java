package com.wipro.velocity.object;

public class Student {
	
	private String firstName;
	private String lastName;
	private String rollnumber;
	private Address address;
	
	public Student() {
		super();
		
	}

	public Student(String firstName, String lastName, String rollnumber, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollnumber = rollnumber;
		this.address = address;
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

	public String getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
