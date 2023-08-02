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
		lblTotalSales.setBounds(454, 454, 272, 37);
		add(lblTotalSales);
		
		JLabel lblStaffMenu = new JLabel("Staff Menu");
		lblStaffMenu.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblStaffMenu.setBounds(641, 61, 195, 73);
		add(lblStaffMenu);
		
		JButton btnBack = new JButton("Log out");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showStaffLoginScreen();
			}
		});
		btnBack.setBounds(454, 536, 304, 61);
		add(btnBack);
	} 
}
