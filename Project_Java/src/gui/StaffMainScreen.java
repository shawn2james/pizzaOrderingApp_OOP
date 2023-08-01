package gui;

import javax.swing.JPanel;

import controller.MainFrame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.MainFrame;

import java.awt.event.ActionListener;
import java.awt.List;
import java.awt.event.ActionEvent;

public class StaffMainScreen extends JPanel {
	private MainFrame main;
	public StaffMainScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		
		JButton btnViewInventory = new JButton("View Inventory");
		btnViewInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] toppings = main.getController().inventory.getToppings();
				int[] quantities = main.getController().inventory.getQuantities();
				main.showInventoryScreen();
			}
		});
		btnViewInventory.setBounds(158, 84, 115, 29);
		add(btnViewInventory);
		
		JButton btnViewOrders = new JButton("View Orders");
		btnViewOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showOrderScreen();
			}
		});
		btnViewOrders.setBounds(158, 140, 115, 29);
		add(btnViewOrders);
		
		JLabel label = new JLabel("");
		label.setBounds(75, 179, 69, 20);
		add(label);
		
		JLabel lblTotalSales = new JLabel("Total Sales");
		lblTotalSales.setBounds(96, 201, 233, 20);
		add(lblTotalSales);
		
		JLabel lblStaffMenu = new JLabel("Staff Menu");
		lblStaffMenu.setBounds(168, 32, 87, 20);
		add(lblStaffMenu);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showStaffLoginScreen();
			}
		});
		btnBack.setBounds(73, 237, 115, 29);
		add(btnBack);
	} 
}
