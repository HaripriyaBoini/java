package Assignments_of_ContrlStmts;

public class ReverseDigits {

	public static void main(String[] args) {
		int n=234;
		int rev=0;
System.out.println("before reverse:"+n);
		while(n!=0) {
		rev=rev*10;
		rev=rev+(n%10);
		n=n/10;}
		 System.out.println("after reverse"+rev);
	}
}

            
	    
	    