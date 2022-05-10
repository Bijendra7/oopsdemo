package oopsdemo3;

public class InSufficientFundsException extends Exception {
	private static final long serialVersionUID = 1L;
	private double amount;

	public InSufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
