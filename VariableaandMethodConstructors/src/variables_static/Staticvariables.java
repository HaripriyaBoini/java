package variables_static;

public class Staticvariables {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.basicPay=10000;
		employee.hra=8000;
		employee.da=2000;
		
		double totalSalary=employee.getTotalSalary();
		System.out.println(totalSalary);
		//System.out.println(Employee.companyName);
		System.out.println(employee.companyName);
		
		employee.companyName="ABC private Limited";
		
		Employee employee2=new Employee();
		totalSalary=employee2.getTotalSalary();
		System.out.println(totalSalary);
		System.out.println(employee2.companyName);
	}
		
	}


