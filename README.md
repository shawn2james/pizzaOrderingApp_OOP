## NOTES
#### WINDOWS:
- Customer / staff selection screen
For customers:
- Food Menu window
- Customization window
	- Confirm button
For staff:
- Login screen
- main page 
	- Order summary with ability to view each order
	- Total sales
	- View inventory button
	- Create new item button
	- Individual order window
		- Edit option
		- Delete option
	- Inventory window
		- Edit option
- 


#### CLASSES:
- MainFrame
- Controller
- DataStorage
	- orders
	- staffs - type-Vector<Staff>
	- items - type-Vector<Item>
	* addItem()
	* editItem()
	* removeItem()	
- OrderList 
	- orders: type-Vector<Order>
	- totalSales: type-double
	* addOrder()
	* removeOrder(orderNo)
	* editOrder(orderNo)
- Order
	- orderNo: type-int
	- pizzas: type-Vector<Pizza>
	- drinks: type-Vector<Drink>
	- totalPrice: type-double
	* addItem()
	* removeItem()
- Item
	- name: type-String
	- price: type-double
- Pizza (inherits from Item)
	- toppings: type-List<String>
- Drink (inherits from Item)
	- iceLevel: type-int => 0, 25, 50, 75
- Inventory
	- toppings: List<String>
- Staff
	- username: String
	- password: String
	* addItem()
	* editItem()
	* removeItem()

GENERAL NOTES:
- Pizza and drink categories in menu
- ice level dropdown list for drinks

