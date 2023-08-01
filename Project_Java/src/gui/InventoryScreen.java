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
		
		int pos = 0;
		for (int i = 0; i<toppings.length; i++){
			toppingLbl = new JLabel(toppings[i]);
			toppingLbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
			toppingLbl.setHorizontalAlignment(SwingConstants.LEFT);
			toppingLbl.setBounds(0,pos,500,70);
			add(toppingLbl);
			
			plusBtn = new JButton("+");
			plusBtn.setBounds(308, pos, 115, 29);
			add(plusBtn);
			
			qtyLbl = new JLabel(String.valueOf(quantities[i]));
			qtyLbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
			qtyLbl.setHorizontalAlignment(SwingConstants.LEFT);
			qtyLbl.setBounds(400,pos,500,70);
			add(qtyLbl);
			
			minusBtn = new JButton("-");
			minusBtn.setBounds(600, pos, 115, 29);
			add(minusBtn);
			
			pos+=50;			
		};
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showStaffMainScreen();
			}
		});
		btnBack.setBounds(74, 236, 115, 29);
		add(btnBack);
		
		
		
		JButton button_2 = new JButton("-");
		button_2.setBounds(175, 105, 115, 29);
		add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.setBounds(308, 104, 115, 29);
		add(button_3);
		
		JButton button_5 = new JButton("+");
		button_5.setBounds(308, 147, 115, 29);
		add(button_5);
		
		JButton button_4 = new JButton("-");
		button_4.setBounds(175, 147, 115, 29);
		add(button_4);
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventory.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		lblInventory.setBounds(600, 49, 600, 40);
		add(lblInventory);
	} 
}
