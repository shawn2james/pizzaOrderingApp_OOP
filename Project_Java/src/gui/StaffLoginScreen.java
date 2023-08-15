package gui;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

import controller.MainFrame;
import data.Staff;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class StaffLoginScreen extends JPanel {
	private MainFrame main;
	private JTextField textField;
	private JPasswordField textField_1;
	private JLabel lblError;
	private AbstractButton showPasswordCheckBox;
	public StaffLoginScreen(MainFrame main) {
		this.main = main;
		
		  
		
		setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
		
		showPasswordCheckBox = new JCheckBox("Show Password");
		showPasswordCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		showPasswordCheckBox.setBounds(599, 336, 150, 25);
		add(showPasswordCheckBox);
		showPasswordCheckBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JCheckBox checkBox = (JCheckBox) e.getSource();
				textField_1.setEchoChar(checkBox.isSelected()? '\0' : '*');
				
				
			}
		});
		btnLogin.setBounds(776, 382, 128, 37);
		add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showSelectionScreen();
			}
			}
		);
		btnBack.setBounds(599, 382, 115, 36);
		add(btnBack);

		
		
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        textField.requestFocusInWindow();
		    }
		});
		

		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField.setBounds(599, 199, 305, 37);
		add(textField);
		textField.setColumns(10);
		
		textField.requestFocusInWindow();
		
		textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_1.setBounds(599, 286, 305, 37);
		add(textField_1);
		textField_1.setColumns(10);
		
				
		
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblUsername.setBounds(405, 203, 163, 20);
		add(lblUsername);
		
		 lblError = new JLabel("Please check your Username or Password!");
		 lblError.setForeground(Color.RED);
		 lblError.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblError.setBounds(599, 478, 438, 20);
		lblError.setVisible(false);
		add(lblError);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(405, 294, 163, 20);
		add(lblNewLabel_1);
		
		JLabel lblLogIn = new JLabel("Log in ");
		lblLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogIn.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		lblLogIn.setBounds(369, 46, 600, 40);
		add(lblLogIn);
	} 
}
