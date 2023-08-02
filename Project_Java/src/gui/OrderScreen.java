package gui;

import javax.swing.JPanel;

import controller.MainFrame;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class OrderScreen extends JPanel{
	private MainFrame main;
	public OrderScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblOrders = new JLabel("Orders");
		lblOrders.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblOrders.setBounds(637, 105, 145, 85);
		add(lblOrders);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showStaffMainScreen();
			}
		});
		btnBack.setBounds(512, 458, 115, 29);
		add(btnBack);
	} 

}
