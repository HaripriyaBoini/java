package Methods;

public class Employee {
	double basicPay;
	double hra;
	double da;
	
	double getTotalSalary() {
		return basicPay+hra+da;
	}
	double getTotalSalarywithIncentive(double incentive) {
		return basicPay+hra+da+incentive;
	}
	void displayValues() {
		System.out.println("basicpay"+basicPay);
		System.out.println("hr"+hra);
		System.out.println("da"+da);
		System.out.println("total salary"+getTotalSalary());
		System.out.println("with incentive"+getTotalSalarywithIncentive(10000));
		
		
		
	}

}
