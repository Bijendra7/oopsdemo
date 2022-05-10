package oopsdemo1;

public class Time {
	private int hrs;
	private int min;
	private int sec;

	Time() {
		this.hrs = 0;
		this.min = 0;
		this.sec = 0;
	}

	Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}

	void add(Time obj) {
		this.sec = this.sec + obj.sec;
		if (this.sec > 60) {
			this.sec = this.sec - 60;
			this.min++;
		}
		this.min = this.min + obj.min;
		if (this.min > 60) {
			this.min = this.min - 60;
			this.hrs++;
		}
		this.hrs = this.hrs + obj.hrs;
	}

	void display() {
		System.out.println(this.hrs + " : " + this.min + " : " + this.sec);
	}

	public static void main(String[] args) {
		Time t1 = new Time(12, 45, 55);
		Time t2 = new Time(10, 30, 30);
		t1.add(t2);
		System.out.println("The Addition of 2 Times is : ");
		t1.display();
	}
}