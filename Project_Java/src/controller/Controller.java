package controller;

import java.util.Vector;

import data.DataStorage;
import data.Drink;
import data.Inventory;
import data.Order;
import data.Pizza;
import data.Staff;

public class Controller {
	public DataStorage ds = new DataStorage();
	public Order currentOrder = new Order();
	public Inventory inventory = new Inventory();


	public Order getAllOrders() { 
		return null;
	 }

	public Order getOrder(int orderNo) { 
		return null;
	 }

	public Vector<Staff> getAllStaffs() { 
		return null;
	 } 

	public Pizza[] getAllPizzas() {
		Pizza[] opArr = new Pizza[this.ds.getPizzas().size()];
		this.ds.getPizzas().toArray(opArr);
		return opArr;
	}
	
	public Drink[] getAllDrinks() {
		Drink[] opArr = new Drink[this.ds.getDrinks().size()];
		this.ds.getDrinks().toArray(opArr);
		return opArr;
	}
}
