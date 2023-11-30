package demo08.custom_excp;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(int amount) {
		System.out.println("sorry but you are short of"+amount+"Rs");
	}
}
