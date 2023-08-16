package gui;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Vector;

import javax.swing.SwingConstants;

import controller.MainFrame;
import data.Drink;
import data.Item;
import data.Order;
import data.Pizza;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCartScreen extends JPanel {
	private MainFrame main;
	public ViewCartScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		JScrollPane scrollPane = new JScrollPane(this);
		JScrollBar vertical = scrollPane.getVerticalScrollBar();
		vertical.setValue( vertical.getMaximum() );
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 100, 1920, 600);
        JPanel contentPane = new JPanel(null);
        this.setPreferredSize(new Dimension(1920, 1080));
        contentPane.add(scrollPane);
        main.add(contentPane, "ViewCart");
		
		JLabel lblYourCart = new JLabel("Your Cart");
		lblYourCart.setBounds(650, 50, 600, 40);
		lblYourCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourCart.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		contentPane.add(lblYourCart);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(1500, 900, 141, 42);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.getController().ds.addOrder(main.getController().currentOrder);
				for(int i=0; i<main.getController().currentOrder.getItems().size(); i++) {
					Item item = main.getController().currentOrder.getItems().get(i);
					if(item instanceof Pizza) {
						Vector<String> toppings = ((Pizza)item).getToppings();
						for(int j=0; j<toppings.size(); j++) main.getController().inventory.remove(toppings.get(j));
					}
				}
				main.getController().currentOrder = new Order();
				main.showSelectionScreen();
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(1200, 900, 141, 42);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showMenuScreen();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(btnBack);
		
		Vector<Item> currentItems = main.getController().currentOrder.getItems();
		if(currentItems.size()==0) {
			JLabel lblEmpty= new JLabel("Your cart is empty :(");
			lblEmpty.setBounds(150, 20, 300, 100);
			lblEmpty.setHorizontalAlignment(SwingConstants.LEFT);
			lblEmpty.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
			add(lblEmpty);
			btnConfirm.setEnabled(false);
		} else {
	
			JLabel lblItemName;
			JButton btnX;
			JLabel lblSize;
			JLabel lblIceLevel;
			JLabel lblToppings;
			JLabel lblPrice;
			int pos = 20;
			for(int i=0; i<currentItems.size(); i++) {
				if(currentItems.get(i) instanceof Drink) {
					Drink drink = (Drink)(currentItems.get(i));
					lblItemName = new JLabel(drink.getName());
					lblItemName.setBounds(150, pos, 300, 100);
					lblItemName.setHorizontalAlignment(SwingConstants.LEFT);
					lblItemName.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
					add(lblItemName);
				
					
					btnX = new JButton("X");
					btnX.putClientProperty("item index", i);
					btnX.setBounds(800, pos+50, 50, 50);
					btnX.setHorizontalAlignment(SwingConstants.CENTER);
					btnX.setFont(new Font("Tahoma", Font.PLAIN, 13));
					btnX.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JButton clickedBtn = (JButton)(e.getSource());
							main.getController().currentOrder.removeItem((int)(clickedBtn.getClientProperty("item index")));
							main.showMenuScreen();
						}
					});
					add(btnX);
					pos += 30;
					
					double totalPrice = 0.0;
			        for (Item item : currentItems) {
			            totalPrice += item.getPrice();
			        }
			            
			        JLabel lblTotalPrice = new JLabel("Total Price: $" + totalPrice);
			        lblTotalPrice.setBounds(1200, pos, 300, 100); 
			        lblTotalPrice.setHorizontalAlignment(SwingConstants.RIGHT);
			        lblTotalPrice.setFont(new Font("Tahoma", Font.BOLD, 25));
			        add(lblTotalPrice);
					
					lblSize = new JLabel("Size: " + drink.getSize());
					lblSize.setBounds(150, pos, 300, 100);
					lblSize.setHorizontalAlignment(SwingConstants.LEFT);
					lblSize.setFont(new Font("Tahoma", Font.PLAIN, 20));
					add(lblSize);
					pos += 30;
					
					lblPrice = new JLabel("Price: " + drink.getPrice());
					lblPrice.setBounds(150, pos, 300, 100);
					lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
					lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
					add(lblPrice);
					pos += 30;
					
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
					
					btnX = new JButton("X");
					btnX.putClientProperty("item index", i);
					btnX.setBounds(800, pos+50, 50, 50);
					btnX.setHorizontalAlignment(SwingConstants.CENTER);
					btnX.setFont(new Font("Tahoma", Font.PLAIN, 13));
					btnX.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JButton clickedBtn = (JButton)(e.getSource());
							System.out.println(clickedBtn.getClientProperty("item index"));
							main.getController().currentOrder.removeItem((int)(clickedBtn.getClientProperty("item index")));
							main.showMenuScreen();
						}
					});
					add(btnX);
					pos += 30;
					
					lblSize = new JLabel("Size: " + pizza.getSize());
					lblSize.setBounds(150, pos, 300, 100);
					lblSize.setHorizontalAlignment(SwingConstants.LEFT);
					lblSize.setFont(new Font("Tahoma", Font.PLAIN, 20));
					add(lblSize);
					pos += 30;
					
					lblPrice = new JLabel("Price: " + pizza.getPrice());
					lblPrice.setBounds(150, pos, 300, 100);
					lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
					lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
					add(lblPrice);
					pos += 30;
					
					lblToppings = new JLabel("Toppings:");
					lblToppings.setBounds(150, pos, 300, 100);
					lblToppings.setHorizontalAlignment(SwingConstants.LEFT);
					lblToppings.setFont(new Font("Tahoma", Font.PLAIN, 20));
					add(lblToppings);
					pos += 30;
					
					JLabel lblToppingName;
					for(int j=0; j<pizza.getToppings().size(); j++) {
						lblToppingName = new JLabel(pizza.getToppings().get(j));
						lblToppingName.setBounds(150, pos, 300, 100);
						lblToppingName.setHorizontalAlignment(SwingConstants.LEFT);
						lblToppingName.setFont(new Font("Tahoma", Font.PLAIN, 16));
						add(lblToppingName);
						pos += 20;
					}
					pos += 50;
				}
			}
		}
	}
}
