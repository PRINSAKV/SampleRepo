package inheritance;

import java.util.Scanner;
	
public class EmployeeDetails {
	double basicpay;
	double deduction;
	double bonus;
	
public void display()
	{
	try (Scanner in = new Scanner(System.in)) {
		System.out.println("Basic pay: ");
		basicpay = in.nextDouble();
		System.out.println("Deduction: ");
		deduction = in.nextDouble();
		System.out.println("Bonus: ");
		bonus = in.nextDouble();
	}
	
	}
}
 