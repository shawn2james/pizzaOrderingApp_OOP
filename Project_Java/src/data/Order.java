package data;

import java.util.List;

public class Order {

	/**
	 * 
	 */
	private double totalPrice;
	/**
	 * 
	 */
	public Item item;
	/**
	 * 
	 */
	public Drink drink;
	/**
	 * 
	 */
	public List<Item> items;
	/**
	 * 
	 */
	private int orderNo;
	/**
	 * 
	 */
	public Pizza pizza;
	/**
	 * Getter of totalPrice
	 */
	public double getTotalPrice() {
	 	 return totalPrice; 
	}
	/**
	 * Setter of totalPrice
	 */
	public void setTotalPrice(double totalPrice) { 
		 this.totalPrice = totalPrice; 
	}
	/**
	 * Getter of item
	 */
	public Item getItem() {
	 	 return item; 
	}
	/**
	 * Setter of item
	 */
	public void setItem(Item item) { 
		 this.item = item; 
	}
	/**
	 * Getter of drink
	 */
	public Drink getDrink() {
	 	 return drink; 
	}
	/**
	 * Setter of drink
	 */
	public void setDrink(Drink drink) { 
		 this.drink = drink; 
	}
	/**
	 * Getter of items
	 */
	public List<Item> getItems() {
	 	 return items; 
	}
	/**
	 * Setter of items
	 */
	public void setItems(List<Item> items) { 
		 this.items = items; 
	}
	/**
	 * Getter of orderNo
	 */
	public int getOrderNo() {
	 	 return orderNo; 
	}
	/**
	 * Setter of orderNo
	 */
	public void setOrderNo(int orderNo) { 
		 this.orderNo = orderNo; 
	}
	/**
	 * Getter of pizza
	 */
	public Pizza getPizza() {
	 	 return pizza; 
	}
	/**
	 * Setter of pizza
	 */
	public void setPizza(Pizza pizza) { 
		 this.pizza = pizza; 
	}
	/**
	 * 
	 * @param itemIndex 
	 */
	public void removeItem(int itemIndex) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param item 
	 */
	public void addItem(Item item) { 
		// TODO Auto-generated method
	 } 

}
