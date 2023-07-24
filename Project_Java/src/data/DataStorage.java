package data;

import java.util.List;

import controller.Controller;

public class DataStorage {
	public Controller controller;
	public Order order;
	private List<Order> orders;
	public Vector<Staff> staffs;
	public Vector<Drink> drinks;
	public Vector<Pizza> pizzas;
	private Vector<Staff> staffs;

	public Controller getController() {
	 	 return controller; 
	}

	public void setController(Controller controller) { 
		 this.controller = controller; 
	}

	public Order getOrder() {
	 	 return order; 
	}

	public void setOrder(Order order) { 
		 this.order = order; 
	}

	public List<Order> getOrders() {
	 	 return orders; 
	}

	public void setOrders(List<Order> orders) { 
		 this.orders = orders; 
	}

	public Staff getStaff() {
	 	 return staff; 
	}

	public void setStaff(Staff staff) { 
		 this.staff = staff; 
	}

	public List<Drink> getDrinks() {
	 	 return drinks; 
	}

	public void setDrinks(List<Drink> drinks) { 
		 this.drinks = drinks; 
	}

	public List<Pizza> getPizzas() {
	 	 return pizzas; 
	}

	public void setPizzas(List<Pizza> pizzas) { 
		 this.pizzas = pizzas; 
	}

	public List<Staff> getStaffs() {
	 	 return staffs; 
	}

	public void setStaffs(List<Staff> staffs) { 
		 this.staffs = staffs; 
	}

	public void editOrder(Order newOrder, int orderNo) { 
		// TODO Auto-generated method
	 }

	public double getTotalSales() { 
		// TODO Auto-generated method
		return 0;
	 }

	public void addMenuItem(Item newItem) { 
		// TODO Auto-generated method
	 }

	public void removeMenuItem(Item item) { 
		// TODO Auto-generated method
	 }

	public void addOrder(Order order) { 
		// TODO Auto-generated method
	 }

	public void removeOrder(Order order) { 
		// TODO Auto-generated method
	 } 

}
