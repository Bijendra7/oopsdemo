package oopsdemo3;

public class CheckingAccount {
	private double balance;
	private int number;

	public CheckingAccount(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}

	public void deposite(double amount) {
		balance += amount;
	}

	public void withDrow(double amount) throws InSufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InSufficientFundsException(needs);
		}
	}
}
