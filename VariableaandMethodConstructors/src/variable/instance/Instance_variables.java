package variable.instance;

public class Instance_variables {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.basicPay=10000;
		employee.hra=8000;
		employee.da=2000;
		
		double totalSalary=employee.getTotalSalary();
		System.out.println(totalSalary);
		
		Employee employee2=new Employee();
		
		totalSalary=employee2.getTotalSalary();
		System.out.println(totalSalary);
	}

}
