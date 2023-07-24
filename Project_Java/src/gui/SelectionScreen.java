package gui;

import javax.swing.JFrame;

import controller.MainFrame;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectionScreen extends JFrame {
	private MainFrame main;
	
	public SelectionScreen(MainFrame main) {
		this.main = main;
		getContentPane().setLayout(null);
		
		JButton btnCustomerStartOrdering = new JButton("Customer? Start Ordering!");
		btnCustomerStartOrdering.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showSelectionScreen();
			}
		});
		btnCustomerStartOrdering.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCustomerStartOrdering.setBounds(125, 85, 271, 47);
		getContentPane().add(btnCustomerStartOrdering);
		
		JButton btnStaff = new JButton("Staff");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showStaffLoginScreen();
			}
		});
		btnStaff.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnStaff.setBounds(125, 168, 271, 47);
		getContentPane().add(btnStaff);
	} 
}
