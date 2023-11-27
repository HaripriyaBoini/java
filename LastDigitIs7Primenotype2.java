package methods;

public class LastDigitIs7Primenotype2 {
	static boolean toFindNumPrimeOrNot(int n){
		int i=2;
		boolean res = true;
		
		for(;(i<n/2) && (n % i != 0);i++);
		
		if(i < n/2) res = false;
		return res;
	}
	public static void main(String[] args) {
	
		
		// last digit should be 7 which is prime number
		
		for(int i=200,count =0,m=0,f=0,l=0;i>=100;i--) {
			if ( toFindNumPrimeOrNot(i) == true) {
				l= i % 10;
				f = i / 100;
				m = (i / 10) % 10;
				if(m < (f+l))
				System.out.print(i+" ");
				
				
			}
		}
	
	}
}
	
