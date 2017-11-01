import java.text.DecimalFormat;
public class RetailItem {
	// @author Isaac Otero
	private String description;
	private double price;
	private int unitsOnHand;
	private int upc;
	/*
	 * @param description
	 * @param price
	 * @param unitsOnHand
	 * @param upc
	 */
	  //@param description, price, how many units, and the upc of the item
	  public RetailItem(String description, double price, int unitsOnHand, int upc){
		this.description = description;
		this.price = price;
		this.unitsOnHand = unitsOnHand;
		this.upc = upc;
	}
	public double getPrice(){
		return price;
	}
	public String getDescription(){
		return description;
	}
	public int getUnits(){
		return unitsOnHand;
	}
	public int getUpc(){
		return upc;
	}
	public void setUnits(int unitsOnHand){
		if (unitsOnHand >= 0){
			this.unitsOnHand = unitsOnHand;
		}
	}
	public void setPrice(double price){
		if (price >= 0){
			this.price = price;
		}
	}
	public String toString(){
		DecimalFormat df = new DecimalFormat("0.00");
		return "Item: " + description + "\nPrice: $" + df.format(price) + "\nUnits left: " + unitsOnHand + "\nUPC: " + upc + "\n";
	}
} // end of class
