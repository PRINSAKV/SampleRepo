package inheritance;

public class HraAndPf extends EmployeeDetails {
	double hra;
	double pf;
	
public void calculateHraAndPf() {
	hra = 0.05 * basicpay;
	pf = 0.20 * basicpay;
	
}


}
