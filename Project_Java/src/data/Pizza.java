package data;

import java.util.Vector;

public class Pizza extends Item {
	private Vector<String> toppings = new Vector<String>();
	
	public Pizza(String name, double[] prices) {
		this.setName(name);
		this.setPrices(prices);
		this.setSize("S");
	}
	
	public Pizza(String name, double[] prices, String size) {
		this.setName(name);
		this.setPrices(prices);
		this.setSize(size);
	}
	
	public Vector<String> getToppings() {
		return toppings;
	}
	
	public void setToppings(Vector<String> toppings) {
		this.toppings = toppings;
	}
	
	public void addTopping(String topping) {
		this.toppings.add(topping);
	}
	
	public void removeTopping(String topping) {
		this.toppings.remove(topping);
	}

	@Override
	public double getPrice() {
		double actualPrice;
		if(getSize()=="S") actualPrice = getPrices()[0];
		else if(getSize()=="M") actualPrice = getPrices()[1];
		else actualPrice = getPrices()[2];
		
		return actualPrice + getToppings().size();
	}
}
