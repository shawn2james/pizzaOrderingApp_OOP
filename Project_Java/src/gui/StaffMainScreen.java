package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.MainFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffMainScreen extends JPanel {
	private MainFrame main;
	public StaffMainScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		
		JButton btnViewInventory = new JButton("View Inventory");
		btnViewInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				main.showInventoryScreen();
			}
		});
		btnViewInventory.setBounds(158, 46, 115, 29);
		add(btnViewInventory);
		
		JButton btnViewOrders = new JButton("View Orders");
		btnViewOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showOrderScreen();
			}
		});
		btnViewOrders.setBounds(158, 111, 115, 29);
		add(btnViewOrders);
		
		JLabel label = new JLabel("");
		label.setBounds(75, 179, 69, 20);
		add(label);
		
		JLabel lblTotalSales = new JLabel("Total Sales");
		lblTotalSales.setBounds(123, 179, 233, 20);
		add(lblTotalSales);
	} 

}
