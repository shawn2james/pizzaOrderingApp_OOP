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
			lblCustomizeYourDrink.setBounds(367, 44, 203, 25);
			lblCustomizeYourDrink.setHorizontalAlignment(SwingConstants.CENTER);
			lblCustomizeYourDrink.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 21));
			add(lblCustomizeYourDrink);
			
			JLabel lblSize = new JLabel("Size:");
			lblSize.setHorizontalAlignment(SwingConstants.RIGHT);
			lblSize.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblSize.setBounds(75, 142, 78, 31);
			add(lblSize);
			
			JLabel lblIceLevel = new JLabel("Ice Level:");
			lblIceLevel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblIceLevel.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblIceLevel.setBounds(54, 209, 99, 31);
			add(lblIceLevel);
			
			JComboBox comboBox = new JComboBox(sizes);
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
			comboBox.setBounds(187, 139, 195, 38);
			add(comboBox);
			
			JComboBox comboBox_1 = new JComboBox(iceLevels);
			comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			comboBox_1.setSelectedIndex(0);
			comboBox_1.setBounds(187, 206, 195, 38);
			add(comboBox_1);
			
			JButton btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					main.showMenuScreen();
				}
			});
			btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnBack.setBounds(300, 350, 141, 31);
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
			btnConfirm.setBounds(486, 350, 141, 31);
			add(btnConfirm);
		} else if (item instanceof Pizza) {
			JLabel lblCustomizeYourPizza = new JLabel("Customize your Pizza");
			lblCustomizeYourPizza.setBounds(367, 44, 250, 25);
			lblCustomizeYourPizza.setHorizontalAlignment(SwingConstants.CENTER);
			lblCustomizeYourPizza.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 21));
			add(lblCustomizeYourPizza);
			
			JLabel lblSize = new JLabel("Size:");
			lblSize.setHorizontalAlignment(SwingConstants.RIGHT);
			lblSize.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblSize.setBounds(75, 142, 78, 31);
			add(lblSize);
			
			JLabel lblToppings = new JLabel("Toppings:");
			lblToppings.setHorizontalAlignment(SwingConstants.RIGHT);
			lblToppings.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblToppings.setBounds(54, 209, 99, 31);
			add(lblToppings);
			
			JComboBox comboBox = new JComboBox(sizes);
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
			comboBox.setBounds(187, 139, 195, 38);
			add(comboBox);
			
			String[] toppings = main.getController().inventory.getToppings();
			int pos = 209;
			for(int i=0; i<toppings.length; i++) {
				JCheckBox chkTopping = new JCheckBox(toppings[i]);
				chkTopping.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JCheckBox chkBox = (JCheckBox)(e.getSource());
						if(chkBox.isEnabled()==true) {
							((Pizza) item).addTopping(chkBox.getText());
						} else {
							((Pizza) item).removeTopping(chkBox.getText());
						}
					}
				});
				chkTopping.setBounds(187, pos, 200, 40);
				chkTopping.setFont(new Font("Tahoma", Font.PLAIN, 18));
				pos += 30;
				add(chkTopping);
			}
			
			JButton btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					main.showMenuScreen();
				}
			});
			btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnBack.setBounds(300, 400, 141, 31);
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
			btnConfirm.setBounds(486, 400, 141, 31);
			add(btnConfirm);
		}
	}
}
