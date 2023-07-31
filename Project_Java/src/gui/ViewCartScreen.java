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
		lblYourCart.setBounds(396, 44, 148, 25);
		lblYourCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourCart.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 23));
		add(lblYourCart);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.getController().ds.addOrder(main.getController().currentOrder);
				main.getController().currentOrder = new Order();
				main.showSelectionScreen();
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnConfirm.setBounds(773, 419, 141, 42);
		add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showMenuScreen();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBack.setBounds(600, 419, 141, 42);
		add(btnBack);
		
		Vector<Item> currentItems = main.getController().currentOrder.getItems();
		JLabel lblItemName;
		JLabel lblSize;
		JLabel lblIceLevel;
		JLabel lblToppings;
		JLabel lblPrice;
		int pos = 70;
		for(int i=0; i<currentItems.size(); i++) {
			if(currentItems.get(i) instanceof Drink) {
				Drink drink = (Drink)(currentItems.get(i));
				lblItemName = new JLabel(drink.getName());
				lblItemName.setBounds(150, pos, 300, 100);
				lblItemName.setHorizontalAlignment(SwingConstants.LEFT);
				lblItemName.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 23));
				add(lblItemName);
				pos += 30;
				
				lblSize = new JLabel("Size: " + drink.getSize());
				lblSize.setBounds(150, pos, 300, 100);
				lblSize.setHorizontalAlignment(SwingConstants.LEFT);
				lblSize.setFont(new Font("Tahoma", Font.PLAIN, 18));
				add(lblSize);
				pos += 30;
				
				lblPrice = new JLabel("Price: " + drink.getPrice());
				lblPrice.setBounds(150, pos, 300, 100);
				lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
				lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 18));
				add(lblPrice);
				pos += 30;
				
				lblIceLevel = new JLabel("Ice Level: " + drink.getIceLevel());
				lblIceLevel.setBounds(150, pos, 300, 100);
				lblIceLevel.setHorizontalAlignment(SwingConstants.LEFT);
				lblIceLevel.setFont(new Font("Tahoma", Font.PLAIN, 18));
				add(lblIceLevel);
				pos += 50;
			} else if(currentItems.get(i) instanceof Pizza) {
				Pizza pizza = (Pizza)(currentItems.get(i));
				lblItemName = new JLabel(pizza.getName());
				lblItemName.setBounds(150, pos, 300, 100);
				lblItemName.setHorizontalAlignment(SwingConstants.LEFT);
				lblItemName.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 23));
				add(lblItemName);
				pos += 30;
				
				lblSize = new JLabel("Size: " + pizza.getSize());
				lblSize.setBounds(150, pos, 300, 100);
				lblSize.setHorizontalAlignment(SwingConstants.LEFT);
				lblSize.setFont(new Font("Tahoma", Font.PLAIN, 18));
				add(lblSize);
				pos += 30;
				
				lblPrice = new JLabel("Price: " + pizza.getPrice());
				lblPrice.setBounds(150, pos, 300, 100);
				lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
				lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 18));
				add(lblPrice);
				pos += 30;
				
				lblToppings = new JLabel("Toppings:");
				lblToppings.setBounds(150, pos, 300, 100);
				lblToppings.setHorizontalAlignment(SwingConstants.LEFT);
				lblToppings.setFont(new Font("Tahoma", Font.PLAIN, 18));
				add(lblToppings);
				pos += 25;
				
				JLabel lblToppingName;
				for(int j=0; j<pizza.getToppings().size(); j++) {
					lblToppingName = new JLabel(pizza.getToppings().get(j));
					lblToppingName.setBounds(150, pos, 300, 100);
					lblToppingName.setHorizontalAlignment(SwingConstants.LEFT);
					lblToppingName.setFont(new Font("Tahoma", Font.PLAIN, 16));
					add(lblToppingName);
					pos += 25;
				}
				pos += 25;
			}
		}
	}
}
