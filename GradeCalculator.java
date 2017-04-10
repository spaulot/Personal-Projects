/* create a class that takes input from user
 * first, on the total points each assignment is worth
 * then, the grade actually received on assignments
 * 
 * Personal Assignment for Fun!
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.NumberFormat;

public class GradeCalculator {


	public static void main(String[] args) throws Exception
	{
		try (Scanner in = new Scanner( System.in) ){
		//totalPoints, userPoints, finalGrade, tempValue;
		double totalPoints, userPoints, finalGrade, tempValue, tempPersonal;
		totalPoints = 0;
		tempValue = 0;
		userPoints = 0;
		tempPersonal = 0;
		
		//take user input for total amt of points per assignment
		System.out.println("Please input the total points for each assignment.");
		System.out.println("Enter negative integer when complete.");
		
		tempValue = in.nextInt();
		while (tempValue>0){
			totalPoints += tempValue;
			tempValue = in.nextInt();
		}
		
		System.out.println("Please input personal grades for each assignment.");
		System.out.println("Enter negative integer when complete.");
		
		
		tempPersonal = in.nextDouble();
		while (tempPersonal>0){
			userPoints += tempPersonal;
			tempPersonal = in.nextDouble();
		}
		
		System.out.println("Calculating your grade...");
		finalGrade = userPoints/totalPoints;
		NumberFormat defaultFormat = NumberFormat.getPercentInstance();
		defaultFormat.setMinimumFractionDigits(1);
		System.out.println("Your grade is: " + defaultFormat.format(finalGrade));
		
		}
		
		catch (InputMismatchException e) {
		    System.out.print(e.getMessage());
		}
		
}
}
