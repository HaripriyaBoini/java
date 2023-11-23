package methods;

public class Args_and_return {
	// methods-- 4 types
		//   args ... return
		
		
		static float converToRupees(String country,float currency) {
			
			if(country.equalsIgnoreCase("US")) {
				
				return currency * 87.45f;
			}
			else if(country.equalsIgnoreCase("UK")) {
				
				return currency * 120f;
			}
			else if(country.equalsIgnoreCase("UAE")) {
				
				return currency * 220;
			}
			else {
				return 0;
			}
		}
		public static void main(String[] args) {
			
			
			float rupees = converToRupees("US",100);
			
			System.out.println("US Dollar = Indian Rupees ---->"+rupees);
			
			 rupees = converToRupees("UK",100);
			
			System.out.println("UK  Euro = Indian Rupees ---->"+rupees);
			
			rupees = converToRupees("UAE",100);
			
			System.out.println("UAE Dinar = Indian Rupees ---->"+rupees);
			
		
		
		}
		

}

