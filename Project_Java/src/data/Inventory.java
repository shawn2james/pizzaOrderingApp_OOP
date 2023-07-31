package data;

import java.util.List;

public class Inventory {
	public int[] quantities = {10, 13, 25};
	private String[] toppings = {"Cheese", "Pepperoni", "Bacon"};

	public int[] getQuantities() {
	 	 return quantities; 
	}
	/**
	 * Setter of quantities
	 */
	public void setQuantities(int[] quantities) { 
		 this.quantities = quantities; 
	}
	/**
	 * Getter of toppings
	 */
	public String[] getToppings() {
	 	 return toppings; 
	}
	/**
	 * Setter of toppings
	 */
	public void setToppings(String[] toppings) { 
		 this.toppings = toppings; 
	}
	/**
	 * 
	 * @param qty 
	 * @param topping 
	 */
	public void remove(int qty, String topping) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param topping 
	 * @param qty 
	 */
	public void add(String topping, int qty) { 
		// TODO Auto-generated method
	 } 

}
