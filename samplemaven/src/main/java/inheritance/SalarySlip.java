package inheritance;

public class SalarySlip extends HraAndPf {
		
		double totalSalary;
		
public void calculateTotalSalary() {
	
		totalSalary = basicpay+hra-pf-deduction+bonus;
}
public void printSalarySlip() {
	System.out.println("Salary Slip:");
	System.out.println("Basic pay:" + basicpay);
	System.out.println("Deduction:" + deduction);
	System.out.println("Bonus:" + bonus);
	System.out.println("HRA(5% of basic pay):"+ hra);
	System.out.println("PF(20% of basic pay):" + pf);
	System.out.println("Total Salary by Hand:" + totalSalary);
}
	
public void getSalary() {
	display();
	calculateHraAndPf();
	calculateTotalSalary();
	printSalarySlip();
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	SalarySlip SalarySlip = new SalarySlip();
	SalarySlip.getSalary();
	

	}

}
