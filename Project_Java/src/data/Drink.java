package data;

public class Drink extends Item {
	private String iceLevel;
	
	public Drink(String name, double[] prices) {
		this.setName(name);
		this.setPrices(prices);
		this.setSize("S");
	}
	
	public Drink(String name, double[] prices, String	 size) {
		this.setName(name);
		this.setPrices(prices);
		this.setSize(size);
	}
	public String getIceLevel() {
	 	 return iceLevel; 
	}

	public void setIceLevel(String iceLevel) { 
		 this.iceLevel = iceLevel; 
	} 

}
