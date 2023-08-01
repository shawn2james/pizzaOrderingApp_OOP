package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class OrderScreen extends JPanel{
	public OrderScreen() {
		setLayout(null);
		
		JLabel lblOrders = new JLabel("Orders");
		lblOrders.setBounds(179, 37, 69, 20);
		add(lblOrders);
	} 

}
