package data;

import java.util.List;

public class Inventory {

	/**
	 * 
	 */
	private List<String> toppings;
	/**
	 * 
	 */
	public List<Integer> quantities;
	/**
	 * Getter of toppings
	 */
	public List<String> getToppings() {
	 	 return toppings; 
	}
	/**
	 * Setter of toppings
	 */
	public void setToppings(List<String> toppings) { 
		 this.toppings = toppings; 
	}
	/**
	 * Getter of quantities
	 */
	public List<Integer> getQuantities() {
	 	 return quantities; 
	}
	/**
	 * Setter of quantities
	 */
	public void setQuantities(List<Integer> quantities) { 
		 this.quantities = quantities; 
	}
	/**
	 * 
	 * @param topping 
	 * @param qty 
	 */
	public void add(String topping, int qty) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param qty 
	 * @param topping 
	 */
	public void remove(int qty, String topping) { 
		// TODO Auto-generated method
	 } 

}
