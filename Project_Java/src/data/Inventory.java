package data;

import java.util.List;

public class Inventory {
	public int[] quantities = {10, 13, 25};
	private String[] toppings = {"Cheese", "Pepperoni", "Bacon"};

	public int[] getQuantities() {
	 	 return quantities; 
	}
	
	public void setQuantities(int[] quantities) { 
		 this.quantities = quantities; 
	}
	
	public String[] getToppings() {
	 	 return toppings; 
	}
	
	public void setToppings(String[] toppings) { 
		 this.toppings = toppings; 
	}
	
	public void remove(String topping) { 
		for(int i=0; i<toppings.length; i++) {
			if(toppings[i]==topping) quantities[i]-=1;
		}
	}
	
	public void add(String topping) { 
		for(int i=0; i<toppings.length; i++) {
			if(toppings[i]==topping) quantities[i]+=1;
		}	 } 

}
