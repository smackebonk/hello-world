
/**
 * @author Kalle
 *
 */
public class BankAccount implements Measurable{
	
	private double balance;
	
	public BankAccount(double initialDeposit) {
		this.balance = initialDeposit;
	}
	public BankAccount() {
		this(0);
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public double getMeasure() {
		return balance;
	}

	
}
