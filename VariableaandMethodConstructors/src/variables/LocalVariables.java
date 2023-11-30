package variables;

public class LocalVariables {

	public static void main(String[] args) {
		Employee employee=new Employee();
		
		double totalSalary=employee.getTotalSalary(10000,5000,2000);
		
		System.out.println("salary ="+totalSalary);

	}

}
