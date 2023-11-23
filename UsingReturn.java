package methods;

public class UsingReturn {
	// methods-- 4 types
		//  no args ... return
		
		static float dollarInRupees(){
			
			return 87.45f; 
		}
		
		static String indiaCapital() {
			
			return "Delhi";
		}
		
		
		
		public static void main(String[] args) {
			
			float dollar = 100;
			
			float rupees = dollar * dollarInRupees();
			
			System.out.println("Indian Rupees ---->"+rupees);
			
			System.out.println("India Capital---->"+indiaCapital());
		}
		
}			
		
		

	

