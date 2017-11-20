import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class Assignment14 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		File fread = new File("UPC.txt");
		Scanner inputFile = new Scanner(fread);
		String[] Inventory = new String[20592];
		for (int i = 0; i < Inventory.length; i++){
			Inventory[i] = inputFile.nextLine();
		}
		boolean notDone = true;
		boolean found = false;
		double total = 0;
		while(notDone){
			System.out.print("Enter UPC (Enter -1 to stop): ");
			String upc = input.nextLine();
			if (upc.equals("-1")){
				notDone = false;
				System.out.println("Total cost: $" + df.format(total));
			}
			else{
				for(int i = 2; i < Inventory.length; i++){
					if (Inventory[i].equals(upc)){
						if (Inventory[i-1].equals("0")){
							System.out.println("Out of stock.");
						}
						else{
							double price = Double.parseDouble(Inventory[i-2]);
							int units = Integer.parseInt(Inventory[i-1]);
							String item = Inventory[i-3];
							RetailItem retail = new RetailItem(item, price, units,Integer.parseInt(upc));
							System.out.print(retail);
							retail.setUnits((units-1));
							Inventory[i-1] = Integer.toString(retail.getUnits());
							total += price;
						}
						found = true;
					}
				}
				if (!found){
					System.out.println("Item not found.");
				}
				found = false;
			}
		
		}
		inputFile.close();
		input.close();
	}
}
/*
Enter UPC (Enter -1 to stop): 76000
Item: 100% Whole Wheat Hamburger Buns
Price: $5.11
Units left: 20
UPC: 76000
Enter UPC (Enter -1 to stop): 11108
Item: Asparagus Spears
Price: $7.06
Units left: 37
UPC: 11108
Enter UPC (Enter -1 to stop): 11108
Item: Asparagus Spears
Price: $7.06
Units left: 36
UPC: 11108
Enter UPC (Enter -1 to stop): 96944
Item: Green Peas
Price: $2.88
Units left: 41
UPC: 96944
Enter UPC (Enter -1 to stop): 61835
Item: Corn Crisps
Price: $9.45
Units left: 35
UPC: 61835
Enter UPC (Enter -1 to stop): 22252
Item not found.
Enter UPC (Enter -1 to stop): -1
Total cost: $31.56

Enter UPC (Enter -1 to stop): 63236
Item: Colby & Monterey Jack - Regular Shredded
Price: $4.61
Units left: 17
UPC: 63236
Enter UPC (Enter -1 to stop): 63488
Item: Mild Cheddar - Finely Shredded
Price: $7.20
Units left: 5
UPC: 63488
Enter UPC (Enter -1 to stop): 76000
Item: 100% Whole Wheat Hamburger Buns
Price: $5.11
Units left: 20
UPC: 76000
Enter UPC (Enter -1 to stop): 63488
Item: Mild Cheddar - Finely Shredded
Price: $7.20
Units left: 4
UPC: 63488
Enter UPC (Enter -1 to stop): 548454
Item not found.
Enter UPC (Enter -1 to stop): 63867
Item: Mild Cheddar - Finely Shredded
Price: $3.20
Units left: 32
UPC: 63867
Enter UPC (Enter -1 to stop): 63867
Item: Mild Cheddar - Finely Shredded
Price: $3.20
Units left: 31
UPC: 63867
Enter UPC (Enter -1 to stop): 80336
Item: STEAMABLE CHOPPED SPINACH ORGANIC
Price: $7.25
Units left: 12
UPC: 80336
Enter UPC (Enter -1 to stop): -1
Total cost: $37.77
*/
