package variables;

public class Employee {

                 double getTotalSalary(double basicPay,double hra,double da) {
                	 double totalSalary; 
                	 if(basicPay>=10000) {
                		 totalSalary=basicPay+hra+da;
                	 }
                	 else {
                		 totalSalary=basicPay+hra+da+5000;
                	 }
                
                     return totalSalary;
	}
}


