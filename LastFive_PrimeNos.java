package methods;

public class LastFive_PrimeNos {
	static boolean toFindNumPrimeOrNot(int n){
		int i=2;
		boolean res = true;
		
		for(;(i<n/2) && (n % i != 0);i++);
		
		if(i < n/2) res = false;
		return res;
	}
	public static void main(String[] args) {
	
		
		// last 5 prime numbers
		
		for(int i=200,count =0;i>=100;i--) {
			if (toFindNumPrimeOrNot(i) == true) {
				System.out.print(i+" ");
				count++;
				if(count == 5) break;
			}
		}
	
	}
}
