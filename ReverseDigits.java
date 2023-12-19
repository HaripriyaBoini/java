package Assignments_of_ContrlStmts;

public class ReverseDigits {

	public static void main(String[] args) {
		int n=1234;
       int rev=0;
System.out.println("before reverse:"+n);
		while(n!=0) {
			
		rev=rev*10;    //0       40       430
		rev=rev+(n%10);//0+4=4   40+3=43  430+2
		n=n/10;         //123      12      0
		
		}
		 System.out.println("after reverse"+rev);
	}
}

            
	    
	    