/**
 * 
 */

/**
 * @author Kalle
 *
 */
public class UserDemo {
	
	public static void main (String[] args) {
		
		user kalle = new user("Kalle");
		user anna = new user("Anna");
		user peter = new user("Peter");
		
		System.out.println("Name: " + kalle.getName());
		System.out.println("User_ID: " + kalle.getUserId());
		System.out.println("Name: " + peter.getName());
		System.out.println("User_ID: " + peter.getUserId());
		System.out.println("Name: " + anna.getName());
		System.out.println("User_ID: " + anna.getUserId());


	}

}
