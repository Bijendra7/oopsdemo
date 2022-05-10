package oopsdemo3;

public class ThrowExample {
	public void checkEligibility(int age, int weight) {
		if (age < 12 || weight < 40) {
			throw new ArithmeticException("Student is not Eligible for registration .");
		} else {
			System.out.println("Student with age : " + age + " and " + weight + " is eligible");
		}
	}

	public static void main(String[] k) {
		ThrowExample te = new ThrowExample();
		System.out.println("Welcome to sports eligibility process");
		te.checkEligibility(11, 41);
		System.out.println("Thank You so much");
	}
}
