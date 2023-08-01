package gui;

import javax.swing.JPanel;

import controller.MainFrame;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderScreen extends JPanel{
	private MainFrame main;
	public OrderScreen() {
		this.main = main;
		setLayout(null);
		
		JLabel lblOrders = new JLabel("Orders");
		lblOrders.setBounds(179, 37, 69, 20);
		add(lblOrders);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showStaffMainScreen();
			}
		});
		btnBack.setBounds(93, 156, 115, 29);
		add(btnBack);
	} 

}
