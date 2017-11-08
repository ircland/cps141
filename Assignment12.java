// @author Isaac Otero
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

/* 
EXECUTION 1: SHOWING THE ARRAY ONLY HOLDS 30 VALUES
This program collects test scores, calculates the average, and determines if each grade is above or below the average.
Enter up to 30 test scores OR enter a negative value to stop.

Enter test score 1: 94

Enter test score 2: 87

Enter test score 3: 49

Enter test score 4: 95

Enter test score 5: 38

Enter test score 6: 67

Enter test score 7: 79

Enter test score 8: 83

Enter test score 9: 79

Enter test score 10: 77

Enter test score 11: 53

Enter test score 12: 70

Enter test score 13: 80

Enter test score 14: 50

Enter test score 15: 16

Enter test score 16: 86

Enter test score 17: 47

Enter test score 18: 94

Enter test score 19: 83

Enter test score 20: 99

Enter test score 21: 100

Enter test score 22: 86

Enter test score 23: 83

Enter test score 24: 82

Enter test score 25: 90

Enter test score 26: 93

Enter test score 27: 75

Enter test score 28: 63

Enter test score 29: 36

Enter test score 30: 76
Test average: 73.667
Test score 1: 94.0 - Above average
Test score 2: 87.0 - Above average
Test score 3: 49.0 - Below average
Test score 4: 95.0 - Above average
Test score 5: 38.0 - Below average
Test score 6: 67.0 - Below average
Test score 7: 79.0 - Above average
Test score 8: 83.0 - Above average
Test score 9: 79.0 - Above average
Test score 10: 77.0 - Above average
Test score 11: 53.0 - Below average
Test score 12: 70.0 - Below average
Test score 13: 80.0 - Above average
Test score 14: 50.0 - Below average
Test score 15: 16.0 - Below average
Test score 16: 86.0 - Above average
Test score 17: 47.0 - Below average
Test score 18: 94.0 - Above average
Test score 19: 83.0 - Above average
Test score 20: 99.0 - Above average
Test score 21: 100.0 - Above average
Test score 22: 86.0 - Above average
Test score 23: 83.0 - Above average
Test score 24: 82.0 - Above average
Test score 25: 90.0 - Above average
Test score 26: 93.0 - Above average
Test score 27: 75.0 - Above average
Test score 28: 63.0 - Below average
Test score 29: 36.0 - Below average
Test score 30: 76.0 - Above average

EXECUTION 2:
This program collects test scores, calculates the average, and determines if each grade is above or below the average.
Enter up to 30 test scores OR enter a negative value to stop.

Enter test score 1: 90

Enter test score 2: 99

Enter test score 3: 30

Enter test score 4: 50

Enter test score 5: -1
Test average: 67.250
Test score 1: 90.0 - Above average
Test score 2: 99.0 - Above average
Test score 3: 30.0 - Below average
Test score 4: 50.0 - Below average
*/