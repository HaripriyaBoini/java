package methods;

public class ToFind_PrimeOrNot {

		static boolean toFindNumPrimeOrNot(int n){
			int i=2;
			
			for(;(i<n/2) && (n % i != 0);i++);
			
			if(i == n/2) return true;
			return false;
		}
		public static void main(String[] args) {
		
			int num =19;
			System.out.println("Result----->"+toFindNumPrimeOrNot(num));
			
		
		
		
		
		}

		
		
	}

	


