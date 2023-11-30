package demo03.excp_handling;

public class ExcpHandlingMechanism {

	 
		static int division(int i) {
		
				return 10/i;   //throws new arithmetic Expression
			}
		static void divideByZero(int i) {
			int a=division(i);
		}
		static void subRoutine() {
			int d=0;
			divideByZero(d);
		}
		public static void main(String[] args) {
			System.out.println("starts");
			try {
			subRoutine();
			}
			catch(ArithmeticException a) {
				//a.printStackTrace();
			}
			System.out.println("ends");
			
		}
			
		

	

}
