package demo08.custom_excp;

public class CustomExceptionDemo {

	public static void main(String[] args) {

		System.out.println("start");
	Customer customer = new Customer(10000);
		customer.deposit(5000);
		try {
			customer.withdraw(20000);
		}
		catch(InsufficientFundsException e){
			System.out.println(e.getMessage());
			
		}
		
	}

}
