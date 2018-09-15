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
		
		double ageSum = 0;
		double ageAvarage = 0;
		double accountSum = 0;
		double accountAvarage = 0;
		
		User kalle = new User("Kalle", 39, 12000);
		User anna = new User("Anna", 42, 43000);
		User peter = new User("Peter", 50, 292929);
		User thea = new User();
		ArrayList<User> users = new ArrayList<User>();
		users.add(kalle);
		users.add(anna);
		users.add(peter);
		users.add(thea);
		users.add(new User("Dick", 12, 90000));
		
		for (User element : users) {
			ageSum += element.getMeasure();
			accountSum += element.getAccountBalance();
		}
		ageAvarage = ageSum / users.size();
		accountAvarage = accountSum / users.size();
		System.out.println("Avarage age: " + ageAvarage);
		System.out.println("Savings avarage: " + accountAvarage);

	}

}
