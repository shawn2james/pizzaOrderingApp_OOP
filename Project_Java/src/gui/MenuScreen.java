package gui;


import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import controller.MainFrame;
import data.Drink;
import data.Order;
import data.Pizza;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class MenuScreen extends JPanel {
	private MainFrame main;
			
	public MenuScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		lblMenu.setBounds(650, 50, 600, 40);
		add(lblMenu);

	    JTabbedPane tabby = new JTabbedPane( );
	    tabby.setBounds(0, 200, 1920, 400);
		tabby.setFont(new Font("Tahoma", Font.BOLD, 30));
	    JPanel pizzasTab = new JPanel( );
	    Pizza[] pizzas = main.getController().getAllPizzas();
		JButton[] pizzaButtons  = new JButton[pizzas.length];
		JButton btnPizza;
		int pos = 0;
		for(int i=0; i<pizzas.length; i++) {
			btnPizza = new JButton(pizzas[i].getName());
			btnPizza.setFont(new Font("Tahoma", Font.PLAIN, 19));
			btnPizza.setHorizontalAlignment(SwingConstants.LEFT);
			btnPizza.setBounds(0, pos, 903, 90);
			btnPizza.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton clickedBtn = (JButton)(e.getSource());
					for (int i=0; i<pizzas.length; i++) {
						if (pizzas[i].getName() == clickedBtn.getText()) {
							main.showCustomizeScreen(pizzas[i]);
						}
					}
				}
			});	
			pizzaButtons[i] = btnPizza;
			pos += 90;
		}
		
		for (int i = 0; i < pizzaButtons.length; i++) 
		{
		    pizzasTab.add(pizzaButtons[i]);
		}
		
		JPanel drinksTab = new JPanel( );
	    Drink[] drinks = main.getController().getAllDrinks();
		JButton[] drinkButtons  = new JButton[drinks.length];
		JButton btnDrink;
		pos = 0;
		for(int i=0; i<drinks.length; i++) {
			btnDrink = new JButton(drinks[i].getName());
			btnDrink.setFont(new Font("Tahoma", Font.PLAIN, 19));
			btnDrink.setHorizontalAlignment(SwingConstants.LEFT);
			btnDrink.setBounds(0, pos, 903, 90);
			btnDrink.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton clickedBtn = (JButton)(e.getSource());
					for (int i=0; i<drinks.length; i++) {
						if (drinks[i].getName() == clickedBtn.getText()) {
							main.showCustomizeScreen(drinks[i]);
						}
					}
				}
			});		
			
			drinkButtons[i] = btnDrink;
			pos += 90;
		}
		
		for (int i = 0; i < drinkButtons.length; i++) 
		{
		    drinksTab.add(drinkButtons[i]);
		}
		
		tabby.addTab("Pizzas", pizzasTab);
		tabby.addTab("Drinks", drinksTab);

		pizzasTab.setLayout(new GridLayout(0, 1));
		drinksTab.setLayout(new GridLayout(0, 1));
		add(tabby);
		
		JButton btnNewButton = new JButton("View Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.showViewCartScreen();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(1200, 700, 141, 42);
		add(btnNewButton);
		if(main.getController().currentOrder.getItems().size()==0) {
			btnNewButton.setEnabled(false);
		}
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.getController().currentOrder = new Order();
				main.showSelectionScreen();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnExit.setBounds(1500, 700, 141, 42);
		add(btnExit);
	}
}
