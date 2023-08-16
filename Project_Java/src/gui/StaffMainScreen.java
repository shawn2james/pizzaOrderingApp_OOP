package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import data.Item;
import data.Order;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.lang.Math;

import controller.MainFrame;

import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class StaffMainScreen extends JPanel {
	private MainFrame main;
	public StaffMainScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JButton btnViewInventory = new JButton("View Inventory");
		btnViewInventory.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnViewInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] toppings = main.getController().inventory.getToppings();
				int[] quantities = main.getController().inventory.getQuantities();
				main.showInventoryScreen();
			}
		});
		btnViewInventory.setBounds(454, 226, 304, 54);
		add(btnViewInventory);
		
		JButton btnViewOrders = new JButton("View Orders");
		btnViewOrders.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnViewOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showOrderScreen();
			}
		});
		btnViewOrders.setBounds(454, 332, 304, 54);
		add(btnViewOrders);
		
		JLabel label = new JLabel("");
		label.setBounds(75, 179, 69, 20);
		add(label);
		
		JLabel lblTotalSales = new JLabel("Total Sales:");
		lblTotalSales.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTotalSales.setBounds(912, 237, 304, 37);
		
		Vector<Order> orders = main.getController().ds.getOrders();
		double totalSales = 0;
		for(int i=0; i<orders.size(); i++) {
			Vector<Item> items = orders.get(i).getItems();
			for(int j=0; j<items.size(); j++) {
				totalSales += items.get(j).getPrice();
			}
		}
		lblTotalSales.setText("Total sales: $" + totalSales);
		add(lblTotalSales);
		
		JLabel lblStaffMenu = new JLabel("Staff Menu");
		lblStaffMenu.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblStaffMenu.setBounds(641, 61, 195, 200);
		add(lblStaffMenu);
		
		JButton btnBack = new JButton("Log out");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showSelectionScreen();
			}
		});
		btnBack.setBounds(454, 536, 304, 61);
		add(btnBack);
	} 
}
