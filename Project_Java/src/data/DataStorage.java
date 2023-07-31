package data;

import java.util.List;
import java.util.Vector;

import controller.Controller;

public class DataStorage {
	private Vector<Pizza> pizzas = new Vector<Pizza>();
	private Vector<Drink> drinks = new Vector<Drink>();
	private Vector<Order> orders = new Vector<Order>();
	private Vector<Staff> staffs = new Vector<Staff>();

	public DataStorage () {
		this.getPizzas().add(new Pizza("Chicken Supreme", new double[] {12.20, 13.20, 14.20}));
		this.getPizzas().add(new Pizza("Curry Chicken", new double[] {26.40, 27.40, 28.40}));
		this.getPizzas().add(new Pizza("Hawaiian", new double[] {36.30, 37.30, 38.30}));
		this.getPizzas().add(new Pizza("Meat Galore", new double[] {36.30, 37.30, 38.30}));
		this.getPizzas().add(new Pizza("Pepperoni", new double[] {36.30, 37.30, 38.30}));
		this.getPizzas().add(new Pizza("Super Supreme", new double[] {36.30, 37.30, 38.30}));
		
		this.getDrinks().add(new Drink("Coca Cola", new double[] {2.50, 3.50, 4.50}));
		this.getDrinks().add(new Drink("Mountain Dew", new double[] {3.00, 4.00, 5.00}));
		this.getDrinks().add(new Drink("Fanta Grape", new double[] {2.50, 3.50, 4.50}));
		this.getDrinks().add(new Drink("Fanta Orange", new double[] {2.50, 3.50, 4.50}));
		this.getDrinks().add(new Drink("Ice Lemon Tea", new double[] {3.00, 4.00, 5.00}));
		this.getDrinks().add(new Drink("Sprite", new double[] {2.50, 3.50, 4.50}));
		
		this.getStaffs().add(new Staff("shawnjames", "asdfasdf"));
		this.getStaffs().add(new Staff("amalsuresh", "12341234"));
	}
	
	
	public Vector<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(Vector<Pizza> pizzas) { 
		 this.pizzas = pizzas; 
	}
	
	public Vector<Drink> getDrinks() {
	 	 return drinks; 
	}

	public void setDrinks(Vector<Drink> drinks) { 
		 this.drinks = drinks; 
	}

	public Vector<Order> getOrders() {
	 	 return orders; 
	}

	public void setOrders(Vector<Order> orders) { 
		 this.orders = orders; 
	}

	public Vector<Staff> getStaffs() {
	 	 return staffs; 
	}

	public void setStaffs(Vector<Staff> staffs) { 
		 this.staffs = staffs; 
	}

	public void removeOrder(Order order) { 
		// TODO Auto-generated method
	 }

	public void addMenuItem(Item newItem) { 
		// TODO Auto-generated method
	 }

	public void editOrder(int orderNo, Order newOrder) { 
		// TODO Auto-generated method
	 }

	public double getTotalSales() { 
		// TODO Auto-generated method
		return 0;
	 }
	
	public void addOrder(Order order) { 
		orders.add(order);
	}

	public void removeMenuItem(Item item) { 
		// TODO Auto-generated method
	 } 

}
