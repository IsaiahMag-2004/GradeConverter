/**
 First pass through of the grade converter program which takes in a double score, and outputs a letter grade
 @author (Isaiah Magana)
 
 GradeConverter.java
*/

import java.util.Scanner;

public class GradeConverter {
	/**
	main method to run program
	*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double score;
		String grade;
		
		System.out.print("Enter your score: ");
		score = input.nextDouble();
		
		if(score > 97) {
			grade = "A+";
		}
		else if (score > 93) {
			grade = "A";
		}
		else if (score > 90) {
			grade = "A-";
		}
		else if (score > 87) {
			grade = "B+";
		}
		else if (score > 83) {
			grade = "B";
		}
		else if (score > 80) {
			grade = "B-";
		}
		else if (score > 77) {
			grade = "C+";
		}
		else if (score > 73) {
			grade = "C";
		}
		else if (score > 70) {
			grade = "C-";
		}
		else if (score > 67) {
			grade = "D+";
		}
		else if (score > 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		System.out.println("Score: " + score);
		System.out.println("Grade: " + grade);
	}
}