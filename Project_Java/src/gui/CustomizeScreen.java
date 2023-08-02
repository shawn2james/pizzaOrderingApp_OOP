package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import controller.MainFrame;
import data.Drink;
import data.Item;
import data.Pizza;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class CustomizeScreen extends JPanel {
	private MainFrame main;
	private Item item;
	private String[] sizes = {"S", "M", "L"};
	private String[] iceLevels = {"Regular", "Less ice", "No ice"};
	
	public CustomizeScreen(MainFrame main, Item item) {
		this.main = main;
		this.item = item;
		setLayout(null);
		
		if(item instanceof Drink) {
			JLabel lblCustomizeYourDrink = new JLabel("Customize your drink");
			lblCustomizeYourDrink.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
			lblCustomizeYourDrink.setBounds(650, 50, 600, 40);
			lblCustomizeYourDrink.setHorizontalAlignment(SwingConstants.CENTER);
			add(lblCustomizeYourDrink);
			
			JLabel lblSize = new JLabel("Size:");
			lblSize.setHorizontalAlignment(SwingConstants.RIGHT);
			lblSize.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblSize.setBounds(100, 150, 600, 40);
			add(lblSize);
			
			
			JLabel lblIceLevel = new JLabel("Ice Level:");
			lblIceLevel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblIceLevel.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblIceLevel.setBounds(100, 250, 600, 40);
			add(lblIceLevel);
			
			JComboBox comboBox = new JComboBox(sizes);
			comboBox.setFont(new Font("Tahoma", Font.BOLD, 25));
			comboBox.setBounds(750, 150, 200, 40);
			add(comboBox);
			
			JComboBox comboBox_1 = new JComboBox(iceLevels);
			comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 25));
			comboBox_1.setBounds(750, 250, 200, 40);
			comboBox_1.setSelectedIndex(0);
			add(comboBox_1);
			
			JButton btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					main.showMenuScreen();
				}
			});
			btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnBack.setBounds(800, 350, 200, 50);
			add(btnBack);
			
			JButton btnConfirm = new JButton("Confirm");
			btnConfirm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					item.setSize(comboBox.getSelectedItem().toString());
					((Drink)(item)).setIceLevel(comboBox_1.getSelectedItem().toString());
					main.getController().currentOrder.addItem(item);
					main.showMenuScreen();
				}
			});
			btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnConfirm.setBounds(1100, 350, 200, 50);
			add(btnConfirm);
		} else if (item instanceof Pizza) {
			JLabel lblCustomizeYourPizza = new JLabel("Customize your Pizza");
			lblCustomizeYourPizza.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
			lblCustomizeYourPizza.setBounds(650, 50, 600, 40);
			lblCustomizeYourPizza.setHorizontalAlignment(SwingConstants.CENTER);
			add(lblCustomizeYourPizza);
			
			JLabel lblSize = new JLabel("Size:");
			lblSize.setHorizontalAlignment(SwingConstants.RIGHT);
			lblSize.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblSize.setBounds(100, 150, 600, 40);
			add(lblSize);
			
			JLabel lblToppings = new JLabel("Toppings:");
			lblToppings.setHorizontalAlignment(SwingConstants.RIGHT);
			lblToppings.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblToppings.setBounds(100, 250, 600, 40);
			add(lblToppings);
			
			JComboBox comboBox = new JComboBox(sizes);
			comboBox.setFont(new Font("Tahoma", Font.BOLD, 25));
			comboBox.setBounds(750, 150, 200, 40);
			add(comboBox);
			
			String[] toppings = main.getController().inventory.getToppings();
			int[] quantities = main.getController().inventory.getQuantities();

			int pos = 250;
			for(int i=0; i<toppings.length; i++) {
				if(quantities[i]!=0) {
					JCheckBox chkTopping = new JCheckBox(toppings[i]);
					chkTopping.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JCheckBox chkBox = (JCheckBox)(e.getSource());
							if(chkBox.isEnabled()==true) {
								if(!((Pizza)item).getToppings().contains(chkBox.getText()))
								((Pizza) item).addTopping(chkBox.getText());
							} else {
								((Pizza) item).removeTopping(chkBox.getText());
							}
						}
					});
					chkTopping.setFont(new Font("Tahoma", Font.BOLD, 25));
					chkTopping.setBounds(750, pos, 200, 40);
					pos += 50;
					add(chkTopping);
				}
			}
			
			JButton btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					main.showMenuScreen();
				}
			});
			btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnBack.setBounds(800, pos+80, 200, 50);
			add(btnBack);
			
			JButton btnConfirm = new JButton("Confirm");
			btnConfirm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					item.setSize(comboBox.getSelectedItem().toString());
					Vector<String> toppings = new Vector<String>();
					main.getController().currentOrder.addItem(item);
					main.showMenuScreen();
				}
			});
			btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnConfirm.setBounds(1100, pos+80, 200, 50);
			add(btnConfirm);
		}
	}
}
