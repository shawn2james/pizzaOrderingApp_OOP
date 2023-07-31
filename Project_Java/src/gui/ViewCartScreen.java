package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Vector;

import javax.swing.SwingConstants;

import controller.MainFrame;
import data.Drink;
import data.Item;
import data.Order;
import data.Pizza;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCartScreen extends JPanel {
	private MainFrame main;
	public ViewCartScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblYourCart = new JLabel("Your Cart");
		lblYourCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourCart.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		lblYourCart.setBounds(650, 50, 600, 40);
		add(lblYourCart);
		
		Vector<Item> currentItems = main.getController().currentOrder.getItems();
		JLabel lblItemName;
		JLabel lblSize;
		JLabel lblIceLevel;
		JLabel lblToppings;
		JLabel lblPrice;
		int pos = 90;
		for(int i=0; i<currentItems.size(); i++) {
			if(currentItems.get(i) instanceof Drink) {
				Drink drink = (Drink)(currentItems.get(i));
				lblItemName = new JLabel(drink.getName());
				lblItemName.setBounds(150, pos, 300, 100);
				lblItemName.setHorizontalAlignment(SwingConstants.LEFT);
				lblItemName.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
				add(lblItemName);
				pos += 50;
				
				lblSize = new JLabel("Size: " + drink.getSize());
				lblSize.setBounds(150, pos, 300, 100);
				lblSize.setHorizontalAlignment(SwingConstants.LEFT);
				lblSize.setFont(new Font("Tahoma", Font.PLAIN, 20));
				add(lblSize);
				pos += 50;
				
				lblPrice = new JLabel("Price: " + drink.getPrice());
				lblPrice.setBounds(150, pos, 300, 100);
				lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
				lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
				add(lblPrice);
				pos += 50;
				
				lblIceLevel = new JLabel("Ice Level: " + drink.getIceLevel());
				lblIceLevel.setBounds(150, pos, 300, 100);
				lblIceLevel.setHorizontalAlignment(SwingConstants.LEFT);
				lblIceLevel.setFont(new Font("Tahoma", Font.PLAIN, 20));
				add(lblIceLevel);
				pos += 50;
			} else if(currentItems.get(i) instanceof Pizza) {
				Pizza pizza = (Pizza)(currentItems.get(i));
				lblItemName = new JLabel(pizza.getName());
				lblItemName.setBounds(150, pos, 300, 100);
				lblItemName.setHorizontalAlignment(SwingConstants.LEFT);
				lblItemName.setFont(new Font("Tahoma", Font.BOLD, 25));
				add(lblItemName);
				pos += 50;
				
				lblSize = new JLabel("Size: " + pizza.getSize());
				lblSize.setBounds(150, pos, 300, 100);
				lblSize.setHorizontalAlignment(SwingConstants.LEFT);
				lblSize.setFont(new Font("Tahoma", Font.PLAIN, 20));
				add(lblSize);
				pos += 50;
				
				lblPrice = new JLabel("Price: " + pizza.getPrice());
				lblPrice.setBounds(150, pos, 300, 100);
				lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
				lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
				add(lblPrice);
				pos += 50;
				
				lblToppings = new JLabel("Toppings:");
				lblToppings.setBounds(150, pos, 300, 100);
				lblToppings.setHorizontalAlignment(SwingConstants.LEFT);
				lblToppings.setFont(new Font("Tahoma", Font.PLAIN, 20));
				add(lblToppings);
				pos += 50;
				
				JLabel lblToppingName;
				for(int j=0; j<pizza.getToppings().size(); j++) {
					lblToppingName = new JLabel(pizza.getToppings().get(j));
					lblToppingName.setBounds(150, pos, 300, 100);
					lblToppingName.setHorizontalAlignment(SwingConstants.LEFT);
					lblToppingName.setFont(new Font("Tahoma", Font.PLAIN, 16));
					add(lblToppingName);
					pos += 25;
				}
				pos += 30;
			}
		}
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.getController().ds.addOrder(main.getController().currentOrder);
				main.getController().currentOrder = new Order();
				main.showSelectionScreen();
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnConfirm.setBounds(1500, pos+100, 141, 42);
		add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showMenuScreen();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBack.setBounds(1200, pos+100, 141, 42);
		add(btnBack);
		
	}
}
