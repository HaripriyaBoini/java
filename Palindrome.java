package Assignments_of_ContrlStmts;

public class Palindrome {

	public static void main(String[] args) {
		int n=123321;               //12678                    
		System.out.println("n="+n);
		int rev=0;
		int temp;
		temp=n;
		while(n!=0) {
		rev =rev*10;
		rev=rev+(n%10);
		n=n/10;
		}
		
		if(temp==rev)                             
		System.out.println("palindrome is "+temp);
		else
			System.out.println("not palindrome");      // not palindrome
		
		
	}

	}
