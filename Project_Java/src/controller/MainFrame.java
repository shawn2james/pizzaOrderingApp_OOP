package controller;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import data.Item;
import data.Order;
import data.Staff;
import gui.CustomizeScreen;
import gui.InventoryScreen;
import gui.MenuScreen;
import gui.OrderScreen;
import gui.SelectionScreen;
import gui.StaffLoginScreen;
import gui.StaffMainScreen;
import gui.ViewCartScreen;

public class MainFrame extends JFrame {
	public Controller controller;
	public CardLayout card;
	
	public MainFrame() {
		this.setTitle("Temasek Pizzas");
		this.setSize(1920, 1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.card = new CardLayout();
		this.setLayout(this.card);
		this.controller = new Controller();
		this.showSelectionScreen();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setVisible(true);
	}
	
	public Controller getController() { 
		return this.controller;
	}
	
	public void setController(Controller controller) { 
		 this.controller = controller; 
	}

	public void showSelectionScreen() { 
		SelectionScreen s1 = new SelectionScreen(this);
		this.add(s1, "Selection");
		this.card.show(this.getContentPane(), "Selection");
	}

	public void showCustomizeScreen(Item item) { 
		CustomizeScreen s3 = new CustomizeScreen(this, item);
		this.add(s3, "Customize");
		this.card.show(this.getContentPane(), "Customize");	 
	}
	
	public void showViewCartScreen() { 
		ViewCartScreen s4 = new ViewCartScreen(this);
		this.add(s4, "ViewCart");
		this.card.show(this.getContentPane(), "ViewCart");	 
	}

	public void showOrderScreen() { 
		
	 }

	public void showStaffMainScreen() { 
		StaffMainScreen s6 = new StaffMainScreen(this);
		this.add(s6, "StaffMain");
		this.card.show(this.getContentPane(), "StaffMain");
	 }

	public void showStaffLoginScreen() { 
		StaffLoginScreen s5 = new StaffLoginScreen(this);
		this.add(s5, "StaffLogin");
		this.card.show(this.getContentPane(), "StaffLogin");
	 }

	public void showInventoryScreen() { 
		InventoryScreen s7 = new InventoryScreen(this);
		this.add(s7, "InventoryScreen");
		this.card.show(this.getContentPane(),"InventoryScreen" );
	 }

	public void showMenuScreen() { 
		MenuScreen s2 = new MenuScreen(this);
		this.add(s2, "Menu");
		this.card.show(this.getContentPane(), "Menu");
	 } 
	
	public static void main(String args[]) {
		MainFrame gui = new MainFrame();
	}

}