package data;

import java.util.Vector;

public class Order {

	private Vector<Item> items = new Vector<Item>();
	private int orderNo;
	private double totalPrice;

	public Vector<Item> getItems() {
	 	 return items; 
	}

	public void setItems(Vector<Item> items) { 
		 this.items = items; 
	}

	public int getOrderNo() {
	 	 return orderNo; 
	}

	public void setOrderNo(int orderNo) { 
		 this.orderNo = orderNo; 
	}

	public double getTotalPrice() {
	 	 return totalPrice; 
	}

	public void setTotalPrice(double totalPrice) { 
		 this.totalPrice = totalPrice; 
	}

	public void addItem(Item item) { 
		this.items.add(item);
	 }

	public void removeItem(int itemIndex) { 
		// TODO Auto-generated method
	 } 

}
