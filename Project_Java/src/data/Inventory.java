package data;

import java.util.Random;

public class Inventory {
	private String[] toppings = {"Cheese", "Pepperoni", "Bacon", "Marinara Sauce", "Black Olives", "Mushroom", "Onion"};
	private int[] quantities = new int[toppings.length];

	public Inventory () {
		Random rand = new Random();
		for(int i=0; i<toppings.length; i++) {
			this.quantities[i] = rand.nextInt(20);
			this.quantities[i] += 20;
		}
	}


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
