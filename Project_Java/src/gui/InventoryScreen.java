package gui;

import javax.swing.JPanel;

import controller.MainFrame;

import javax.swing.JLabel;

public class InventoryScreen extends JPanel{
	private MainFrame main;
	public InventoryScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setBounds(193, 16, 69, 20);
		add(lblInventory);
	} 

}
