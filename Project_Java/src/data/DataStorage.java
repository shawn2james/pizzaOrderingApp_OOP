package data;

import java.util.List;

import controller.Controller;

public class DataStorage {

	/**
	 * 
	 */
	private List<Order> orders;
	/**
	 * 
	 */
	public Controller controller;
	public Order order;
	/**
	 * 
	 */
	public Staff staff;
	/**
	 * 
	 */
	private List<Staff> staffs;
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
	 * @param order 
	 */
	public void addOrder(Order order) { 
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
	 * @param orderNo 
	 * @param newOrder 
	 */
	public void editOrder(int orderNo, Order newOrder) { 
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
