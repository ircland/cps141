// @author Isaac
import java.text.DecimalFormat;
import java.util.Scanner;
public class Assignment12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] testScores = new double[30];
		double nextScore = 0;
		double testAvg = 0;
		double count = 0;
		DecimalFormat df = new DecimalFormat("#.000");
		Scanner input = new Scanner(System.in);
		System.out.println("This program collects test scores, calculates the average, and determines if each grade is above or below the average.");
		System.out.println("Enter up to 30 test scores OR enter a negative value to stop.");
		for (int i = 0; i < 30; i++){
			System.out.print("\nEnter test score " + (i+1) + ": ");
			nextScore = input.nextDouble();
			if(nextScore >= 0){
				testAvg += nextScore;
				testScores[i] = nextScore;
				count++;
			}// end of if
			else
				break;
		}// end of for
		testAvg = testAvg/count;
		System.out.println("Test average: " + df.format(testAvg));
		for (int i = 0; i < count; i++ ){
			System.out.print("Test score " + (i + 1) + ": " + testScores[i]);
			if (testScores[i] < testAvg)
				System.out.println(" - Below average");
			else if (testScores[i] > testAvg)
				System.out.println(" - Above average");
			else if (testScores[i] == testAvg)
				System.out.println(" - Average");
		}// end of for
		input.close();
	}// end of main
}// end of class
