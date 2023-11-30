package variables_static;

public class Employee {
	double basicPay;
	double hra;
	double da;
	static String companyName="uno career";
	double getTotalSalary() {
		return basicPay+hra+da;
	}

}
