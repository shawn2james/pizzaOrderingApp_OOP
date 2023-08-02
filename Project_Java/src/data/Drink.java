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

	@Override
	public double getPrice() {
		double actualPrice;
		if(getSize()=="S") actualPrice = getPrices()[0];
		else if(getSize()=="M") actualPrice = getPrices()[1];
		else actualPrice = getPrices()[2];
		
		if(iceLevel=="No ice") return actualPrice+1;
		else if(iceLevel=="Less ice") return actualPrice+0.50;
		else return actualPrice;
	}
}
