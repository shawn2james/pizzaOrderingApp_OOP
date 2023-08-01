package gui;

import controller.MainFrame;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SelectionScreen extends JPanel {
	private MainFrame main;
	
	public SelectionScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JButton btnCustomerStartOrdering = new JButton("Customer? Start Ordering!");
		btnCustomerStartOrdering.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showMenuScreen();
			}
		});
		btnCustomerStartOrdering.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnCustomerStartOrdering.setBounds(700, 300, 500, 80);
		add(btnCustomerStartOrdering);
		
		JButton btnStaff = new JButton("Staff");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showStaffMainScreen();
			}
		});
		btnStaff.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnStaff.setBounds(700, 400, 500, 80);
		add(btnStaff);
		
		JLabel lblTemasekPizzas = new JLabel("Temasek Pizzas");
		lblTemasekPizzas.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemasekPizzas.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 55));
		lblTemasekPizzas.setBounds(730, 50, 500, 47);
		add(lblTemasekPizzas);
	} 
}