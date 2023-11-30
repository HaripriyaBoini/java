package example;

public class Main {                    //main is User-Interface

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setBasicSalary(0);
		emp1.setSales(0);
System.out.println(emp1.getIncentive());
System.out.println(emp1.getTotalSalary());

	}

}
