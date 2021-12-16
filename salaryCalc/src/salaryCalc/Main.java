/**
 * 
 */
package salaryCalc;

import java.util.Scanner;

/**
 * @author corey
 *
 */
public class Main {

	/**
	 * @param args
	 */
	
	public static double salaryCalculator(double hoursPerWeek, double amountPerHour) {
		double weeklyPaycheck = hoursPerWeek * amountPerHour;
		return weeklyPaycheck * 52;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input hours worked per week");
		int userHours = scanner.nextInt();
		
		System.out.println("Please input $$ amount earned per hour");
		int userWage = scanner.nextInt();
		
		
		
		double salary = salaryCalculator(userHours,userWage);
		System.out.println("salary = $" + salary);
		
		

	}

}
