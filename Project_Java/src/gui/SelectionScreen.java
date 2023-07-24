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
				main.showSelectionScreen();
			}
		});
		btnCustomerStartOrdering.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCustomerStartOrdering.setBounds(141, 137, 271, 47);
		add(btnCustomerStartOrdering);
		
		JButton btnStaff = new JButton("Staff");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showStaffLoginScreen();
			}
		});
		btnStaff.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnStaff.setBounds(141, 222, 271, 47);
		add(btnStaff);
		
		JLabel lblTemasekPizzas = new JLabel("Temasek Pizzas");
		lblTemasekPizzas.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemasekPizzas.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 29));
		lblTemasekPizzas.setBounds(114, 36, 312, 47);
		add(lblTemasekPizzas);
	} 
}
