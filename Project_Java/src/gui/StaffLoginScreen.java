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
	public StaffLoginScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String staff_username = textField.getText();
				String staff_password = textField_1.getText();
				Vector<Staff> existingStaffs = main.getController().ds.getStaffs();
				for(int i=0; i<existingStaffs.size(); i++){
					System.out.println(existingStaffs.get(i).getUsername());
					System.out.println(staff_username);
					System.out.println(existingStaffs.get(i).getPassword());
					System.out.println(staff_password);
					if(staff_username == existingStaffs.get(i).getUsername()){
						if(staff_password == existingStaffs.get(i).getPassword()){
							main.showStaffMainScreen();
							break;
							}
						}
						
					}
				}
			});
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
		
		JLabel label = new JLabel("New label");
		label.setBounds(66, 32, 69, 20);
		add(label);
	} 
}
