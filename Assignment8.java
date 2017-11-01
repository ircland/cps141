import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment8 {

	/**
	 * @author isaac otero
	 * @param args
	 */
	public static void main(String[] args) {
		int month = 1;
		double sum = 0.0;
		double average;
		double rainfall;
		double largestRain = 0;
		Scanner input = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("##.##");
		
		System.out.println("This program will calculate the average rainfall per given months.\n" +
						   "To stop user input, enter 999.");
		
		while(true){
			System.out.print("Inches of rainfall for month " + month + "?: ");
			rainfall = input.nextDouble();
			if (rainfall == 999) {
				System.out.println("End of input. Calculating...");
				break;
			} // end of if
			else if (rainfall > largestRain) {
				largestRain = rainfall;
				sum += rainfall;
				month++;
			} // end of else if
			else {
				sum += rainfall;
				month++;
			} // end of else
			
		} // end of loop
		average = sum / (month - 1);
		System.out.println("Total amount of rainfall: " + format.format(sum) + " inches.");
		System.out.println("Average amount of rainfall: " + format.format(average) + " inches.");
		System.out.println("Largest amount of rainfall: " + format.format(largestRain) + " inches.");
		input.close();
	} // end of main

} // end of class

/*
This program will calculate the average rainfall per given months.
To stop user input, enter 999.
Inches of rainfall for month 1?: 362.325
Inches of rainfall for month 2?: 251.2547
Inches of rainfall for month 3?: 785.3264
Inches of rainfall for month 4?: 999
End of input. Calculating...
Total amount of rainfall: 1398.91 inches.
Average amount of rainfall: 466.3 inches.
Largest amount of rainfall: 785.33 inches.

This program will calculate the average rainfall per given months.
To stop user input, enter 999.
Inches of rainfall for month 1?: 20.14
Inches of rainfall for month 2?: 14.35
Inches of rainfall for month 3?: 2.36
Inches of rainfall for month 4?: 0.15
Inches of rainfall for month 5?: 999
End of input. Calculating...
Total amount of rainfall: 37 inches.
Average amount of rainfall: 9.25 inches.
Largest amount of rainfall: 20.14 inches.
*/