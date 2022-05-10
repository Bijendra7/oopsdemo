package oopsdemo2;

public class Student {
	int rollNo;
	String name;
	Address address;

	public Student(int rollNo, String name, Address address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println("***********Student details***************");
		System.out.println("Roll number : " + this.rollNo);
		System.out.println("Name : " + this.name);
		System.out.println("City : " + address.city);
		System.out.println("State : " + address.state);
		System.out.println("Country : " + address.country);
		System.out.println("Pin code : " + address.pinCode);
		System.out.println("******************************************");
	}

}
