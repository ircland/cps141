//@author Isaac Otero
import java.text.DecimalFormat;
public class Retail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Usage: description, price, units, upc
		DecimalFormat df = new DecimalFormat("0.00");
		RetailItem item1 = new RetailItem("bread", 4.95, 25, 259305);
		RetailItem item2 = new RetailItem("soup", 5.89, 13, 395912);
		RetailItem item3 = new RetailItem("dog food", 10.35, 9, 2940104);
		
		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
		
		item1.setPrice(-1.23);
		System.out.println("Updated item 1:\n " + item1);
		item2.setUnits(-1);
		System.out.println("Updated item 2:\n" + item2);
		
		double value1 = item1.getPrice() * item1.getUnits();
		double value2 = item2.getPrice() * item2.getUnits();
		double value3 = item3.getPrice() * item3.getUnits();
		double total = value1 + value2 + value3;
		System.out.println("Inventory value: $" + df.format(total));
		
	}

}
