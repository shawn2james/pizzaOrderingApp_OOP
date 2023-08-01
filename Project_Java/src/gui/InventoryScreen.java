package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import data.Inventory;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InventoryScreen extends JPanel{
	private MainFrame main;
	public InventoryScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		String[] toppings = main.getController().inventory.getToppings();
		int[] quantities = main.getController().inventory.getQuantities();
		JLabel toppingLbl;
		JButton plusBtn;
		JButton minusBtn;
		JLabel qtyLbl;
		
		int pos = 250;
		for (int i = 0; i<toppings.length; i++){
			toppingLbl = new JLabel(toppings[i]+":");
			toppingLbl.setFont(new Font("Tahoma", Font.BOLD, 17));
			toppingLbl.setHorizontalAlignment(SwingConstants.LEFT);
			toppingLbl.setBounds(700,pos,500,30);
			add(toppingLbl);
			
			plusBtn = new JButton("+");
			plusBtn.setBounds(810, pos, 50, 30);
			add(plusBtn);
			
			qtyLbl = new JLabel(String.valueOf(quantities[i]));
			qtyLbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
			qtyLbl.setHorizontalAlignment(SwingConstants.CENTER);
			qtyLbl.setBounds(880,pos,50,30);
			add(qtyLbl);
			
			minusBtn = new JButton("-");
			minusBtn.setBounds(950, pos, 50, 30);
			add(minusBtn);
			
			pos+=100;			
		};
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showStaffMainScreen();
			}
		});
		btnBack.setBounds(1200, 800, 115, 29);
		add(btnBack);
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventory.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		lblInventory.setBounds(600, 49, 600, 40);
		add(lblInventory);
	} 
}
