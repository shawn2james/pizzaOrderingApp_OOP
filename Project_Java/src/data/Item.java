package data;

public class Item {
	private double[] prices;
	private String name;
	private String size;

	
	public double[] getPrices() {
	 	 return prices; 
	}
	
	public double getPrice() {
		if(size=="S") return prices[0];
		else if(size=="M") return prices[1];
		else return prices[2];
	}

	public void setPrices(double[] prices) { 
		 this.prices = prices; 
	}

	public String getName() {
	 	 return name; 
	}

	public void setName(String name) { 
		 this.name = name; 
	} 
	
	
	public String getSize() {
	 	 return size; 
	}
	
	public void setSize(String size) { 
		 this.size = size; 
	} 
}
