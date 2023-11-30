package demo03.excp_handling;

public class TryCatchFinallyExistence {

	public static void main(String[] args) {
		try {
			int number =10;
			int divisor=1;
			int result = number/divisor;
			System.out.println("result="+result);
		}
		catch(ArithmeticException a) {
			System.out.println("handled");
		}
		finally {
			System.out.println("finally");
			
			
		}
		
	}

}
