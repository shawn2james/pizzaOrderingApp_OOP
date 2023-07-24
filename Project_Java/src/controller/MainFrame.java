package controller;

import java.awt.CardLayout;

import javax.swing.JFrame;

import gui.SelectionScreen;

public class MainFrame extends JFrame {
	public Controller controller;
	public CardLayout card;
	
	public MainFrame() {
		this.setTitle("Temasek Pizzas");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.card = new CardLayout();
		this.setLayout(this.card);
		this.controller = new Controller();
		this.showSelectionScreen();
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

	public void showCustomizeScreen() { 
		// TODO Auto-generated method
	 }

	public void showOrderScreen() { 
		// TODO Auto-generated method
	 }

	public void showStaffMainScreen() { 
		// TODO Auto-generated method
	 }

	public void showStaffLoginScreen() { 
		// TODO Auto-generated method
	 }

	public void showInventoryScreen() { 
		// TODO Auto-generated method
	 }

	public void showMenuScreen() { 
		// TODO Auto-generated method
	 } 
	
	public static void main(String args[]) {
		MainFrame gui = new MainFrame();
	}

}
