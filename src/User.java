/**
 * 
 */

/**
 * @author Kalle
 *
 */
public class User implements Measurable {
	
	private String name;
	private int age;
	private int userId;
	private BankAccount userBankAccount;
	private static int lastAssignedId = 0;
	
	public User(String name, int age, double deposit) {
		lastAssignedId++;
		this.userId = lastAssignedId;
		this.name = name;
		this.age = age;
		this.userBankAccount = new BankAccount(deposit);
	}
	public User() {
		this("No name", 0, 0);
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserId() {
		return this.userId;
	}
	public double getAccountBalance() {
		return this.userBankAccount.getMeasure();
	}
	public double getMeasure() {
		double measure = (double) this.age;
		return measure;
	}

}
