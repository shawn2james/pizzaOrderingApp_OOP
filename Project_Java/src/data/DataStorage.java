package data;

import java.util.List;

import controller.Controller;

public class DataStorage {

	/**
	 * 
	 */
	public Controller controller;
	/**
	 * 
	 */
	public Order order;
	/**
	 * 
	 */
	private List<Order> orders;
	/**
	 * 
	 */
	public Staff staff;
	/**
	 * 
	 */
	public List<Drink> drinks;
	/**
	 * 
	 */
	public List<Pizza> pizzas;
	/**
	 * 
	 */
	private List<Staff> staffs;
	/**
	 * Getter of controller
	 */
	public Controller getController() {
	 	 return controller; 
	}
	/**
	 * Setter of controller
	 */
	public void setController(Controller controller) { 
		 this.controller = controller; 
	}
	/**
	 * Getter of order
	 */
	public Order getOrder() {
	 	 return order; 
	}
	/**
	 * Setter of order
	 */
	public void setOrder(Order order) { 
		 this.order = order; 
	}
	/**
	 * Getter of orders
	 */
	public List<Order> getOrders() {
	 	 return orders; 
	}
	/**
	 * Setter of orders
	 */
	public void setOrders(List<Order> orders) { 
		 this.orders = orders; 
	}
	/**
	 * Getter of staff
	 */
	public Staff getStaff() {
	 	 return staff; 
	}
	/**
	 * Setter of staff
	 */
	public void setStaff(Staff staff) { 
		 this.staff = staff; 
	}
	/**
	 * Getter of drinks
	 */
	public List<Drink> getDrinks() {
	 	 return drinks; 
	}
	/**
	 * Setter of drinks
	 */
	public void setDrinks(List<Drink> drinks) { 
		 this.drinks = drinks; 
	}
	/**
	 * Getter of pizzas
	 */
	public List<Pizza> getPizzas() {
	 	 return pizzas; 
	}
	/**
	 * Setter of pizzas
	 */
	public void setPizzas(List<Pizza> pizzas) { 
		 this.pizzas = pizzas; 
	}
	/**
	 * Getter of staffs
	 */
	public List<Staff> getStaffs() {
	 	 return staffs; 
	}
	/**
	 * Setter of staffs
	 */
	public void setStaffs(List<Staff> staffs) { 
		 this.staffs = staffs; 
	}
	/**
	 * 
	 * @param newOrder 
	 * @param orderNo 
	 */
	public void editOrder(Order newOrder, int orderNo) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public double getTotalSales() { 
		// TODO Auto-generated method
		return 0;
	 }
	/**
	 * 
	 * @param newItem 
	 */
	public void addMenuItem(Item newItem) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param item 
	 */
	public void removeMenuItem(Item item) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param order 
	 */
	public void addOrder(Order order) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param order 
	 */
	public void removeOrder(Order order) { 
		// TODO Auto-generated method
	 } 

}
