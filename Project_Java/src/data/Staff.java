package data;

import java.util.Vector;

public class Staff {
	private String username;
	private String password;

	public Staff(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getPassword() {
	 	 return password; 
	}

	public void setPassword(String password) { 
		 this.password = password; 
	}

	public String getUsername() {
	 	 return username; 
	}
	
	public void setUsername(String username) { 
		 this.username = username; 
	}

	public void editOrderItem(int orderNo, int itemIndex, Item editedItem) { 
	
	}

	public void removeOrderItem(int orderNo, int itemIndex) { 
		// TODO Auto-generated method
	 } 

}
