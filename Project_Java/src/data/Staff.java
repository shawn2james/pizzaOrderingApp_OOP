package data;

public class Staff {

	/**
	 * 
	 */
	private String password;
	/**
	 * 
	 */
	private String username;
	/**
	 * Getter of password
	 */
	public String getPassword() {
	 	 return password; 
	}
	/**
	 * Setter of password
	 */
	public void setPassword(String password) { 
		 this.password = password; 
	}
	/**
	 * Getter of username
	 */
	public String getUsername() {
	 	 return username; 
	}
	/**
	 * Setter of username
	 */
	public void setUsername(String username) { 
		 this.username = username; 
	}
	/**
	 * 
	 * @param orderNo 
	 * @param itemIndex 
	 * @param editedItem 
	 */
	protected void editItem(int orderNo, int itemIndex, Item editedItem) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param orderNo 
	 * @param newItem 
	 */
	public void addItem(int orderNo, Item newItem) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param itemIndex 
	 * @param orderNo 
	 */
	public void removeItem(int itemIndex, int orderNo) { 
		// TODO Auto-generated method
	 } 

}
