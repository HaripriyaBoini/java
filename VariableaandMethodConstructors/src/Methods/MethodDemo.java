package Methods;

public class MethodDemo {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.basicPay=10000;
		employee.hra=8000;
		employee.da=2000;
		
		double totalSalary=employee.getTotalSalary();
		System.out.println(totalSalary);
		
		double getNewSalary=employee.getTotalSalarywithIncentive(10000);
		System.out.println(getNewSalary);
		
		employee.displayValues();
		
		
		}
	
	}
		
	


