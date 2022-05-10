package assignment2;

import java.util.Scanner;

public class room {
	private int roomno;
	private String roomtype;
	private int roomarea;
	private int ACmachine;
	Scanner s = new Scanner(System.in);

	public void setdata() {
		System.out.println("Enter Room number : ");
		roomno = s.nextInt();
		s.nextLine();
		System.out.println("Enter Roomtype : ");
		roomtype = s.nextLine();
		System.out.println("Enter Room area : ");
		roomarea = s.nextInt();
		System.out.println("Enter AC number : ");
		ACmachine = s.nextInt();
	}

	public void displaydata() {
		System.out.println("Room number is : " + this.roomno);
		System.out.println("Room type is : " + this.roomtype);
		System.out.println("Room area is : " + this.roomarea);
		System.out.println("Available AC is : " + this.ACmachine);
	}
}
