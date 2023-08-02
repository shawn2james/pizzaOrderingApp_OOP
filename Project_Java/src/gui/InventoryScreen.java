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
			plusBtn.putClientProperty("index", i);
			plusBtn.setBounds(910, pos, 50, 30);
			plusBtn.setFont(new Font("Tahoma", Font.PLAIN, 17));
			plusBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton clickedBtn = (JButton)(e.getSource());
					main.getController().inventory.add(toppings[(int)(clickedBtn.getClientProperty("index"))]);
					main.showInventoryScreen();
				}
			});
			add(plusBtn);
			
			qtyLbl = new JLabel(String.valueOf(quantities[i]));
			qtyLbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
			qtyLbl.setHorizontalAlignment(SwingConstants.CENTER);
			qtyLbl.setBounds(980,pos,50,30);
			add(qtyLbl);
			
			minusBtn = new JButton("-");
			minusBtn.putClientProperty("index", i);
			minusBtn.setBounds(1050, pos, 50, 30);
			minusBtn.setFont(new Font("Tahoma", Font.PLAIN, 17));
			minusBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton clickedBtn = (JButton)(e.getSource());
					main.getController().inventory.remove(toppings[(int)(clickedBtn.getClientProperty("index"))]);
					main.showInventoryScreen();
				}
			});
			add(minusBtn);
			
			pos+=50;			
		};
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showStaffMainScreen();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBack.setBounds(1200, 800, 115, 29);
		add(btnBack);
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventory.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		lblInventory.setBounds(600, 49, 600, 40);
		add(lblInventory);
	} 
}
