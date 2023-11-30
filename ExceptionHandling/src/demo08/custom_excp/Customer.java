package demo08.custom_excp;

public class Customer {
	private int balance;

	public Customer(int initialbalance) {
		super();
		this.balance = initialbalance;
		System.out.println("Initial balance"+balance);
	}
	public void deposit(int amount) {
		balance=balance+amount;
		System.out.println("After deposit"+balance);
	}
	
	public void withdraw(int amount)throws InsufficientFundsException {
		if(amount<=balance) {
			balance=balance-amount;
		}else {
			int neededAmount = amount-balance;
			throw new InsufficientFundsException(neededAmount);
		}
	}
	

}
