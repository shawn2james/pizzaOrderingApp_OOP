package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import controller.MainFrame;
import data.Staff;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class StaffLoginScreen extends JPanel {
	private MainFrame main;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblError;
	public StaffLoginScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String staff_username = textField.getText();
			String staff_password = textField_1.getText();
			Vector<Staff> existingStaffs = main.getController().ds.getStaffs();
			 boolean loginSuccessful = false;
			for(int i=0; i<existingStaffs.size(); i++){
				if(staff_username.equals(existingStaffs.get(i).getUsername())){
					if(staff_password.equals(existingStaffs.get(i).getPassword())){
						loginSuccessful = true; 					
						main.showStaffMainScreen();
					}
			}
					
			}
			lblError.setVisible(!loginSuccessful);
			}});
		btnLogin.setBounds(247, 149, 115, 29);
		add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showSelectionScreen();
			}
			}
		);
		btnBack.setBounds(86, 149, 115, 29);
		add(btnBack);
		
		textField = new JTextField();
		textField.setBounds(227, 29, 146, 26);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(227, 84, 146, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("Username");
		label.setBounds(66, 32, 69, 20);
		add(label);
		
		 lblError = new JLabel("Please check your Username or Password");
		lblError.setBounds(86, 223, 305, 20);
		lblError.setVisible(false);
		add(lblError);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(66, 87, 69, 20);
		add(lblNewLabel_1);
	} 
}
