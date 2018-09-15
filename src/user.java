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
	public user() {
		this("No name");
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserId() {
		return this.userId;
	}

}
