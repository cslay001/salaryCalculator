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
	
	public static double salaryCalculator(double hoursPerWeek, 
										double amountPerHour,
										double vacationDays) {
		if (hoursPerWeek < 0) {
			return -1;
		}
		
		if (amountPerHour < 0) {
			return -1;
		}
		
		if (vacationDays < 0) {
			return -1;
		}
		
		double weeklyPaycheck = hoursPerWeek * amountPerHour;
		double unpaidTime = vacationDays * amountPerHour * 8;
		return (weeklyPaycheck * 52) - unpaidTime;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input hours worked per week");
		int userHours = scanner.nextInt();
		
		System.out.println("Please input $$ amount earned per hour");
		int userWage = scanner.nextInt();
		
		System.out.println("Please input number of unpaid vacation days");
		int userVacation = scanner.nextInt();
		
		
		
		double salary = salaryCalculator(userHours,userWage, userVacation);
		System.out.println("salary = $" + salary);
		
		

	}

}
