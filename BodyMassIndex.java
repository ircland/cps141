import java.util.Scanner;

public class BodyMassIndex {
//author @isaac
	public static void main(String[] args) {
		double userHeight;
		double userWeight;
		double bodyMassIndex;
		double getNormal;
		int normalMax = 25;
		double normalMin = 18.5;
		Scanner input = new Scanner(System.in);
		
		//recieve height and weight from user
		System.out.print("What is your height in inches?: ");
		userHeight = input.nextDouble();
		System.out.print("What is your weight in pounds?: ");
		userWeight = input.nextDouble();
		
		//calculate the data using BMI formula
		bodyMassIndex = (userWeight * 703.07)/(Math.pow(userHeight, 2));
		
		//feedback about BMI
		if (bodyMassIndex > normalMax){
			getNormal = bodyMassIndex - normalMax;
			System.out.println("Based on the given information:\n" + 
							   "Height: " + userHeight + "\n" +
							   "Weight: " + userWeight + " ...\n\n" + 
							   "Your BMI is: " + Math.ceil(bodyMassIndex) + "\n" +
							   "You are overweight!\n" +
							   "You need to lose at least " + Math.ceil(getNormal) + " pounds to get to normal.");
		}
		else if(bodyMassIndex < normalMin){
			getNormal = normalMin - bodyMassIndex;
			System.out.println("Based on the given information:\n" + 
							   "Height: " + userHeight + "\n" +
							   "Weight: " + userWeight + " ...\n\n" + 
							   "Your BMI is: " + Math.ceil(bodyMassIndex) + "\n" +
							   "You are underweight!\n" +
							   "You need to gain at least " + Math.ceil(getNormal) + " pounds to get to normal");
		}
		else {
			System.out.print("Based on the given information:\n" + 
					   		 "Height: " + userHeight + "\n" +
					   		 "Weight: " + userWeight + "...\n\n" + 
					   		 "Your BMI is: " + Math.ceil(bodyMassIndex) + "\n" +
					   		 "You are normal!");
		}
		input.close();
	}

}
/*
-----------------Underweight------------------------------
What is your height in inches?: 69
What is your weight in pounds?: 100
Based on the given information:
Height: 69.0
Weight: 100.0 ...

Your BMI is: 15.0
You are underweight!
You need to gain at least 4.0 pounds to get to normal
-----------------Normal-----------------------------------
What is your height in inches?: 69
What is your weight in pounds?: 126
Based on the given information:
Height: 69.0
Weight: 126.0...

Your BMI is: 19.0
You are normal!
-----------------Overweight--------------------------------
What is your height in inches?: 69
What is your weight in pounds?: 188
Based on the given information:
Height: 69.0
Weight: 188.0 ...

Your BMI is: 28.0
You are overweight!
You need to lose at least 3.0 pounds to get to normal.
---------------------------------------------------------
*/


