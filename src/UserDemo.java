import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Kalle
 *
 */
public class UserDemo {
	
	public static void main (String[] args) {
		
		User kalle = new User("Kalle", 39, 12000);
		User anna = new User("Anna", 42, 43000);
		User peter = new User("Peter", 50, 292929);
		User thea = new User();
		ArrayList<Measurable> users = new ArrayList<>();
		users.add(kalle);
		users.add(anna);
		users.add(peter);
		users.add(thea);
		users.add(new User("Dick", 12, 90000));
		
		BankAccount savings = new BankAccount(10000);
		BankAccount stocks = new BankAccount();
		BankAccount family = new BankAccount(5000);
		BankAccount creditCard = new BankAccount(3000);
		ArrayList<Measurable> accounts = new ArrayList<>();
		accounts.add(savings);
		accounts.add(stocks);
		accounts.add(family);
		accounts.add(creditCard);
		
		System.out.println("Avarage age: " + avarage(users));
		System.out.println("Savings avarage: " + avarage(accounts));

	}
	public static double avarage(ArrayList<Measurable> objects) {
		if (objects.size() == 0) {
			return 0;
		}
		double sum = 0;
		for (Measurable object : objects) {
			sum += object.getMeasure();
		}
		double avarage = sum / objects.size();
		return avarage;
	}

}
