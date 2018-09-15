/**
 * 
 */

/**
 * @author Kalle
 *
 */
public class user {
	
	private String name;
	private int userId;
	private static int lastAssignedId = 0;
	
	public user(String name) {
		lastAssignedId++;
		this.userId = lastAssignedId;
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getUserId() {
		return this.userId;
	}

}
