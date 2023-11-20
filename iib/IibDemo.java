package demo03.iib;
class Accounts{
	int balance;
	{
		balance=1000;
		System.out.println("my balance"+balance);
	}
	public Accounts() {
		System.out.println("accounts cons");
	}
}
class AccountHolder extends Accounts{
	String name;{
	
	name="kaustubh";
	}
	public AccountHolder() {
		System.out.println("Account hoder cons");
}
 
		
	}


	


public class IibDemo {

	public static void main(String[] args) {
		Accounts a1=new Accounts();
		Accounts a2=new Accounts();
		AccountHolder a=new AccountHolder(); }
		

	}



